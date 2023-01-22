/////////////////////////////////////////////////////////////
function getCustomerDetails() {
  let xhttp = new XMLHttpRequest();
  let url = "http://localhost:8080/api/customer";

  xhttp.onload = function () {
    if (this.status == 200) {
      document.getElementById("resp").innerHTML = this.response;
    } else {
      handleResponseError(this);
    }
  };

  xhttp.onerror = (event) => {
    handleNetworkError(event.type + " - getCustomerDetails failed");
  };

  xhttp.open("GET", url);
  xhttp.setRequestHeader(
    "Authorization",
    "bearer " + sessionStorage.getItem("token")
  );
  xhttp.send();
}
/////////////////////////////////////////////////////////////
function updateCoupon(coupnId) {
  let xhttp = new XMLHttpRequest();
  let url = "http://localhost:8080/api/company";

  xhttp.onload = function () {
    if (this.status == 200) {
      document.getElementById("resp").innerHTML = this.response;
    } else {
      handleResponseError(this);
    }
  };

  xhttp.onerror = (event) => {
    handleNetworkError(event.type + " - updateCoupon failed");
  };

  xhttp.open("PUT", url + "?couponId=" + coupnId);
  xhttp.setRequestHeader(
    "Authorization",
    "bearer " + sessionStorage.getItem("token")
  );
  xhttp.send();
}
/////////////////////////////////////////////////////////////

function deleteCompany(companyId) {
  let xhttp = new XMLHttpRequest();
  let url = "http://localhost:8080/api/admin";

  xhttp.onload = function () {
    if (this.status == 200) {
      document.getElementById("resp").innerHTML = this.response;
    } else {
      handleResponseError(this);
    }
  };

  xhttp.onerror = (event) => {
    handleNetworkError(event.type + " - deleteCompany failed");
  };

  xhttp.open("DELETE", url + "?companyId=" + companyId);
  xhttp.setRequestHeader(
    "Authorization",
    "bearer " + sessionStorage.getItem("token")
  );
  xhttp.send();
}

/////////////////////////////////////////////////////////////

function callGreet() {
  let xhttp = new XMLHttpRequest();
  let url = "http://localhost:8080/api/app";

  xhttp.onload = function () {
    if (this.status == 200) {
      document.getElementById("resp").innerHTML = this.response;
    } else {
      handleResponseError(this);
    }
  };

  xhttp.onerror = (event) => {
    handleNetworkError(event.type + " - callGreet failed");
  };

  xhttp.open("GET", url);
  xhttp.setRequestHeader(
    "Authorization",
    "bearer " + sessionStorage.getItem("token")
  );
  xhttp.send();
}

/////////////////////////////////////////////////////////////
