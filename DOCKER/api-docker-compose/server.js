// server.js
const express = require("express");
const { Pool } = require("pg");

const app = express();
const port = 3000;

app.use(express.json());

const pool = new Pool({
  user: "postgres",
  host: "db",
  database: "postgres",
  password: "postgres",
  port: 5432,
});

// Create contacts table
pool.query
`, (err) => {
  if (err) console.error("Error creating table:", err);
});

// Get all contacts
app.get("/contacts", async (req, res) => {
  try {
    const result = await pool.query("SELECT * FROM contacts");
    res.json(result.rows);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
});

// Get a contact by ID
app.get("/contacts/:id", async (req, res) => {
  try {
    const { id } = req.params;
    const result = await pool.query("SELECT * FROM contacts WHERE id = $1", [id]);
    if (result.rows.length === 0) {
      return res.status(404).json({ error: "Contact not found" });
    }
    res.json(result.rows[0]);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
});

// Create a new contact
app.post("/contacts", async (req, res) => {
  try {
    const { name, email, phone } = req.body;
    const result = await pool.query(
      "INSERT INTO contacts (name, email, phone) VALUES ($1, $2, $3) RETURNING *",
      [name, email, phone]
    );
    res.status(201).json(result.rows[0]);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
});

// Update a contact
app.put("/contacts/:id", async (req, res) => {
  try {
    const { id } = req.params;
    const { name, email, phone } = req.body;
    const result = await pool.query(
      "UPDATE contacts SET name = $1, email = $2, phone = $3 WHERE id = $4 RETURNING *",
      [name, email, phone, id]
    );
    if (result.rows.length === 0) {
      return res.status(404).json({ error: "Contact not found" });
    }
    res.json(result.rows[0]);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
});

// Delete a contact
app.delete("/contacts/:id", async (req, res) => {
  try {
    const { id } = req.params;
    const result = await pool.query("DELETE FROM contacts WHERE id = $1 RETURNING *", [id]);
    if (result.rows.length === 0) {
      return res.status(404).json({ error: "Contact not found" });
    }
    res.json({ message: "Contact deleted", contact: result.rows[0] });
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
});

app.listen(port, () => {
  console.log(`Server running on http://localhost:${port}`);
});
