// =========================================
function register(email, password, firstName, lastName, username, role) {
  let xhttp = new XMLHttpRequest();
  let url = "http://localhost:8080/auth/register";

  let user = new User(email, password, firstName, lastName, username, role);
  console.log(user);

  xhttp.onload = function () {
    if (this.status == 200) {
      console.log("register success");
      let token = this.response;
      console.log(token);
      // save token in the browser's session storage memory
      sessionStorage.setItem("token", token);
      setLoggedInMode(true);
    } else {
      console.log("register failed");
      alert("Register Failed - try again");
    }
  };

  xhttp.onerror = (ev) => {
    handleNetworkError(ev.type + " - register operation attempt error");
  };

  xhttp.ontimeout = (ev) => {
    handleNetworkError(ev.type + " - register operation attempt timeout");
  };

  xhttp.open("POST", url);
  xhttp.setRequestHeader("Content-Type", "application/json");
  xhttp.send(JSON.stringify(user));
}

// =========================================
function login(email, password, role) {
  let xhttp = new XMLHttpRequest();
  let url = "http://localhost:8080/auth/login";

  let userCredentials = new UserCredentials(email, password, role);
  console.log(userCredentials);

  xhttp.onload = function () {
    if (this.status == 200) {
      console.log("login success");
      let token = this.response;
      console.log(token);
      // save token in the browser's session storage memory
      sessionStorage.setItem("token", token);
      setLoggedInMode(true);
    } else {
      console.log("login failed");
      console.log(this.response);
      let error = JSON.parse(this.response);
      handleResponseError(this);
    }
  };

  xhttp.onerror = (ev) => {
    handleNetworkError(ev.type + " - login operation attempt error");
  };

  xhttp.ontimeout = (ev) => {
    handleNetworkError(ev.type + " - login operation attempt timeout");
  };

  xhttp.open("POST", url);
  xhttp.setRequestHeader("Content-Type", "application/json");
  xhttp.send(JSON.stringify(userCredentials));
}
// =========================================
function logout() {
  sessionStorage.removeItem("token");
  setLoggedInMode(false);
}
