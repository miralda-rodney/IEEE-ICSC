const functions = require('firebase-functions');
const express = require('express');
const cors = require('cors')({ origin: true });
const app = express();
app.use(cors);

app.get('/', (req, res) => {
    res.send(`
      <!doctype html>
      <head>
        <title>Memetology</title>
        <link rel="stylesheet" href="/style.css">
      <script src="/script.js"></script>
      </head>
      <body>
      <h1>MemO - Version 1</h1>
      <pre lang="xml" id="memetology"></p>
      <script>readMemetologyFile();</script>
      </body>
    </html>
    `);
});

app.get('/provenance', (req, res) => {
    res.send(`
    <!doctype html>
      <head>
        <title>Memetology Provenance</title>
        <link rel="stylesheet" href="/style.css">
      <script src="/script.js"></script>
      </head>
      <body>
      <h1>MemO - Version 1</h1>
      <p>Download the MemO Provenance Document</p>
      <p id="memOProvenance"></p>
      <button type="submit" onclick="window.open("public/provenance.txt")">Download!</button>
      </body>
    </html>
    `);
});

app.get('/pingback', (req, res) => {
    res.send(`
    <!doctype html>
    <head>
      <title>Memetology Pingback</title>
      <link rel="stylesheet" href="/style.css">
    <script src="/script.js"></script>
    </head>
    <body>
    <h1>MemO - Version 1</h1>
    <pre lang="xml" id="memetologyPingback"></p>
    <script>readPingbackFile();</script>
    </body>
  </html>
    `);
});


exports.app = functions.https.onRequest(app);
