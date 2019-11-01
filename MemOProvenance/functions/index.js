const functions = require('firebase-functions');
const express = require('express');
const cors = require('cors')({ origin: true });
const app = express();
app.use(cors);

app.get('/', (req, res) => {
    res.setHeader("Link", "<https://memoprovenance.firebaseapp.com/provenance>;"
    + "rel=\"http://www.w3.org/ns/prov#has_provenance\";"
    + "anchor=\"https://memoprovenance.firebaseapp.com/\"");
    res.send(`
      <!doctype html>
      <head>
        <title>MemO</title>
        <link rel="stylesheet" href="/style.css">
      <script src="/script.js"></script>
      </head>
      <body>
      <h1>MemO - Version 2</h1>
      <pre lang="xml" id="memO"></pre>
      <script>readMemOFile();</script>
      </body>
    </html>
    `);
});

app.get('/provenance', (req, res) => {
  res.setHeader("Link", "<https://memoprovenance.firebaseapp.com/provenance>;"
    + "rel=\"http://www.w3.org/ns/prov#has_provenance\";"
    + "anchor=\"https://memoprovenance.firebaseapp.com/\"");
    res.send(`
    <!doctype html>
      <head>
        <title>MemO Provenance</title>
        <link rel="stylesheet" href="/style.css">
      <script src="/script.js"></script>
      </head>
      <body>
      <h1>MemO - Version 2</h1>
      <p>Download the MemO Provenance Document</p>
      <p id="memOProvenance"></p>
      <button type="submit" onclick="window.open("public/provenance.rdf")">Download!</button>
      </body>
    </html>
    `);
});

app.get('/pingback', (req, res) => {
  res.setHeader("Link", "<https://memoprovenance.firebaseapp.com/provenance>;"
    + "rel=\"http://www.w3.org/ns/prov#has_provenance\";"
    + "anchor=\"https://memoprovenance.firebaseapp.com/\"");
    res.send(`
    <!doctype html>
    <head>
      <title>MemO Pingback</title>
      <link rel="stylesheet" href="/style.css">
    <script src="/script.js"></script>
    </head>
    <body>
    <h1>MemO - Version 2</h1>
    <pre lang="xml" id="memOPingback"></p>
    <script>readPingbackFile();</script>
    </body>
  </html>
    `);
});


exports.app = functions.https.onRequest(app);
