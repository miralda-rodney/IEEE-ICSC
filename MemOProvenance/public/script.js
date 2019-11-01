function readMemOFile() {
    document.getElementById('memO').innerHTML = '...';
    var request = new XMLHttpRequest();
    request.open("GET", "memo.owl", false);
    request.onreadystatechange = function () {
        if (request.readyState == 4) {
            var memOContainer = document.getElementById('memO');
            if (request.status === 200 || request.status === 0){
                var text = request.responseText;
                memOContainer.innerHTML = text;
            }
            else{
                memOContainer.innerHTML = 'There was an error retrieving your file.';
            }
        }
    };
    request.setRequestHeader("Link", "<https://memoprovenance.firebaseapp.com/provenance>;"
                        + "rel=\"http://www.w3.org/ns/prov#has_provenance\";"
                        + "anchor=\"https://memoprovenance.firebaseapp.com/\"");
    request.send(null);
}

/*function readMemOFile(){
    var xhttp = new XMLHttpRequest();
xhttp.onreadystatechange = function() {
if (this.readyState == 4 && this.status == 200) {
    var downloadUrl = URL.createObjectURL(xhttp.response);
    var a = document.createElement("a");
    document.body.appendChild(a);
    a.style = "display: none";
    a.href = downloadUrl;
    a.download = "";
    a.click();
}
};
xhttp.open("GET", "memo.owl", true);
xhttp.responseType = "blob";
xhttp.setRequestHeader('Link', "<https://memoprovenance.firebaseapp.com/provenance>"
                        + "rel=\"http://www.w3.org/ns/prov#has_provenance\""
                        + "anchor=\"https://memoprovenance.firebaseapp.com/\"");
xhttp.setRequestHeader("Content-type", "application/rdf+xml;charset=ISO-8859-1");
xhttp.send();
}*/

/*function readProvenanceFile(){
    var xhttp = new XMLHttpRequest();
xhttp.onreadystatechange = function() {
if (this.readyState == 4 && this.status == 200) {
    var downloadUrl = URL.createObjectURL(xhttp.response);
    var a = document.createElement("a");
    document.body.appendChild(a);
    a.style = "display: none";
    a.href = downloadUrl;
    a.download = "";
    a.click();
}
};
xhttp.open("GET", "provenance.rdf", true);
xhttp.responseType = "blob";
xhttp.setRequestHeader('Link', "<https://memoprovenance.firebaseapp.com/provenance>"
                        + "rel=\"http://www.w3.org/ns/prov#has_provenance\""
                        + "anchor=\"https://memoprovenance.firebaseapp.com/\"");
xhttp.setRequestHeader("Content-type", "application/rdf+xml;charset=ISO-8859-1");
xhttp.send();
}*/

/*function readPingbackFile(){
    var xhttp = new XMLHttpRequest();
xhttp.onreadystatechange = function() {
if (this.readyState == 4 && this.status == 200) {
    var downloadUrl = URL.createObjectURL(xhttp.response);
    var a = document.createElement("a");
    document.body.appendChild(a);
    a.style = "display: none";
    a.href = downloadUrl;
    a.download = "";
    a.click();
}
};
xhttp.open("GET", "pingback.txt", true);
xhttp.responseType = "blob";
xhttp.setRequestHeader('Link', "<https://memoprovenance.firebaseapp.com/provenance>"
                        + "rel=\"http://www.w3.org/ns/prov#has_provenance\""
                        + "anchor=\"https://memoprovenance.firebaseapp.com/\"");
xhttp.setRequestHeader("Content-type", "text/html");
xhttp.send();
}*/

function readPingbackFile(){
    document.getElementById('memOPingback').innerHTML = '...';
    var request = new XMLHttpRequest();
    request.open("GET", "pingback.txt", false);
    request.onreadystatechange = function () {
        if (request.readyState == 4) {
            var memOContainer = document.getElementById('memOPingback');
            if (request.status === 200 || request.status === 0){
                var text = request.response;
                memOContainer.innerHTML = text;
            }
            else{
                memOContainer.innerHTML = 'There was an error retrieving your file.';
            }
        }
    };
    request.setRequestHeader("Link", "<https://memoprovenance.firebaseapp.com/provenance>;"
                        + "rel=\"http://www.w3.org/ns/prov#has_provenance\";"
                        + "anchor=\"https://memoprovenance.firebaseapp.com/\"");
    request.send(null);
}