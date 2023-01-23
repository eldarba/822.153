function handleResponseError(xhttp) {
  console.log(xhttp.response);
  console.log(xhttp.status);
  let errAsJson = xhttp.response;
  let errAsObject = JSON.parse(errAsJson);
  console.log(errAsObject);
  let errorMessage = "ERROR: " + errAsObject.message;
  if (xhttp.status == 401) {
    let accessChalenge = xhttp.getResponseHeader("WWW-Authenticate");
    errorMessage += " Access Chalenge: " + accessChalenge;
  }
  document.getElementById("resp").innerHTML = errorMessage;
}

// function handleClientError(msg) {
//   let resp = document.querySelector("#resp");
//   resp.style.color = "red";
//   resp.innerHTML = "Client Error: " + msg;
//   setTimeout(() => {
//     resp.innerHTML = null;
//     resp.style.color = null;
//   }, 6000);
// }

function handleNetworkError(msg) {
  // let resp = document.getElementById("resp");
  let resp = document.querySelector("#resp");
  resp.style.color = "red";
  resp.innerHTML = "Network Error: " + msg + ". check that server is on";
  setTimeout(() => {
    resp.innerHTML = null;
    resp.style.color = null;
  }, 6000);
}

function setLoggedInMode(isLoggedIn) {
  if (isLoggedIn) {
    document.querySelector("#mode").innerHTML = "Logged In";
    document.querySelector("#mode").style.color = "green";
  } else {
    document.querySelector("#mode").innerHTML = "Logged Out";
    document.querySelector("#mode").style.color = "red";
  }
}
