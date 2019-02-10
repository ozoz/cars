// Create a request variable and assign a new XMLHttpRequest object to it.
var request = new XMLHttpRequest();

// Open a new connection, using the GET request on the URL endpoint
request.open('GET', 'http://localhost:50001/api/v1/car/43', true);

request.onload = function () {
// Begin accessing JSON data here
    var data = JSON.parse(this.response);
    console.log(data);
    document.getElementById("root").innerHTML = this.response;

};


// Send request
request.send();