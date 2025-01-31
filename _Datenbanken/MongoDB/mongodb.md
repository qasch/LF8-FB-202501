# Einführung in MongoDB mit Python

MongoDB ist eine NoSQL-Datenbank, die dokumentenorientiert arbeitet. In Kombination mit Python kann sie über die `pymongo`-Bibliothek genutzt werden.

## 1️⃣ Installation von MongoDB & PyMongo

### 📌 MongoDB installieren
- Unter Linux:
  ```sh
  sudo apt install mongodb
  ```
- Unter Windows: MongoDB von der offiziellen Webseite herunterladen.

### 📌 PyMongo installieren
```sh
pip install pymongo
```

## 2️⃣ Verbindung zur MongoDB herstellen

Ein MongoDB-Server läuft standardmäßig auf Port `27017`. Eine Verbindung wird folgendermaßen aufgebaut:

```python
from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client["testdb"]  # Datenbank erstellen oder verbinden
collection = db["customers"]  # Sammlung (Tabelle) erstellen
```

## 3️⃣ Dokumente einfügen
Ein Dokument ist ein JSON-ähnliches Objekt:

```python
document = {"name": "Max Mustermann", "email": "max@example.com", "age": 30}
collection.insert_one(document)
```

Mehrere Dokumente gleichzeitig einfügen:

```python
documents = [
    {"name": "Anna Schmidt", "email": "anna@example.com", "age": 25},
    {"name": "Peter Müller", "email": "peter@example.com", "age": 40}
]
collection.insert_many(documents)
```

## 4️⃣ Daten abrufen

Alle Dokumente abrufen:
```python
for doc in collection.find():
    print(doc)
```

Bestimmte Felder filtern:
```python
for doc in collection.find({}, {"name": 1, "_id": 0}):
    print(doc)
```

Ein einzelnes Dokument suchen:
```python
result = collection.find_one({"name": "Max Mustermann"})
print(result)
```

## 5️⃣ Dokumente aktualisieren

Ein einzelnes Dokument ändern:
```python
collection.update_one({"name": "Max Mustermann"}, {"$set": {"age": 31}})
```

Mehrere Dokumente ändern:
```python
collection.update_many({}, {"$inc": {"age": 1}})  # Erhöht das Alter um 1
```

## 6️⃣ Dokumente löschen

Ein einzelnes Dokument löschen:
```python
collection.delete_one({"name": "Peter Müller"})
```

Alle Dokumente löschen:
```python
collection.delete_many({})
```

## 7️⃣ Datenbank & Sammlung löschen

Eine komplette Sammlung entfernen:
```python
collection.drop()
```

## Fazit
- MongoDB speichert JSON-ähnliche Dokumente.
- PyMongo ermöglicht einfachen Zugriff auf die Datenbank.
- CRUD-Operationen (`Create`, `Read`, `Update`, `Delete`) lassen sich leicht in Python umsetzen.
- MongoDB ist flexibel und ideal für unstrukturierte Daten.

Diese Grundlagen helfen beim Einstieg in MongoDB mit Python! 🚀


