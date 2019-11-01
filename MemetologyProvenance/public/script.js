function readMemetologyFile() {
    document.getElementById('memetology').innerHTML = '...';
    var request = new XMLHttpRequest();
    request.open("GET", "memetology.owl", false);
    request.onreadystatechange = function () {
        if (request.readyState == 4) {
            var memetologyContainer = document.getElementById('memetology');
            if (request.status === 200 || request.status === 0) {
                var text = request.response;
                memetologyContainer.innerHTML = text;
            }
            else {
                memetologyContainer.innerHTML = 'There was an error retrieving your file.';
            }
        }
    };
    request.send(null);
}

function readPingbackFile(){
    document.getElementById('memetologyPingback').innerHTML = '...';
    var request = new XMLHttpRequest();
    request.open("GET", "pingback.txt", false);
    request.onreadystatechange = function () {
        if (request.readyState == 4) {
            var memOContainer = document.getElementById('memetologyPingback');
            if (request.status === 200 || request.status === 0){
                var text = request.response;
                memOContainer.innerHTML = text;
            }
            else{
                memOContainer.innerHTML = 'There was an error retrieving your file.';
            }
        }
    };
    request.send(null);
}