# API Test Automation Framework

Automation for **ReqRes.in** API using **RestAssured, TestNG, and Java** to validate user creation flows.

---

## 🛠️ Tech Stack
- **Language**: Java 24
- **API Testing**: RestAssured
- **Test Framework**: TestNG
- **Build Tool**: Maven

---

## 📂 Project Structure
```bash
src/
├── main/java/
│   └── com/api/
│       ├── models/         # POJOs (e.g., User.java)
│       └── utils/          # RequestBuilder.java
│
├── test/java/
│   └── com/api/
│       ├── tests/          # API test classes
│       └── testdata/       # JSON payloads
│
pom.xml                    # Maven dependencies