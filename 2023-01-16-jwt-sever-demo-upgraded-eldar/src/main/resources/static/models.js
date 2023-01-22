class User {
  constructor(email, password, firstName, lastName, username, role) {
    this.email = email;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.role = role;
  }
}

class UserCredentials {
  constructor(email, password, role) {
    this.email = email;
    this.password = password;
    this.role = role;
  }
}
