const express = require('express');
const redis = require('redis');

const app = express();
const client = redis.createClient({
  url: 'redis://redis:6379'   // 'redis' = service name from docker-compose
});

client.connect().catch(console.error);

app.get('/', async (req, res) => {
  try {
    let visits = await client.incr('visits');
    res.send(`Hello from GIR Task 07! This page has been visited ${visits} times.\n`);
  } catch (err) {
    res.status(500).send('Error connecting to Redis: ' + err.message);
  }
});

app.listen(8080, () => console.log('App running on port 8080'));
