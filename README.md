# **Hibernate_Maven_OneToMany_Project**

An enterprise-level Java application implementing **Hibernate ORM with Maven** to demonstrate a **One-to-Many relationship** between entities using a **layered architecture** and **relational database mapping**.

This project showcases **object–relational mapping (ORM)**, **JPA annotations**, **transaction management**, and **database persistence** following industry-standard best practices.

---

## **📌 Project Overview**

This application models a **One-to-Many relationship** where one parent entity (e.g., **Department / Customer / Order**) is associated with multiple child entities (e.g., **Employees / Orders / Items**).
Hibernate manages the persistence, relationship mapping, and data integrity automatically.

---

## **🏗️ System Architecture**

```
Presentation Layer
        ↓
Service Layer
        ↓
DAO Layer
        ↓
Hibernate ORM
        ↓
Relational Database
```


## **🧩 Relationship Model**

```
One Parent  →  Many Children
```

Example:

* One **Department** → Many **Employees**
* One **Customer** → Many **Orders**

---

## **🛠️ Technology Stack**

* **Java**
* **Hibernate ORM**
* **JPA Annotations**
* **Maven**
* **MySQL**
* **Apache Tomcat**
* **Eclipse / IntelliJ**

---

## **🔗 Hibernate Mapping**

### Parent Entity

```java
@OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
private List<ChildEntity> children;
```

### Child Entity

```java
@ManyToOne
@JoinColumn(name = "parent_id")
private ParentEntity parent;
```

---

## **🗄️ Database Design**

Hibernate automatically generates tables based on entity mappings.

Example:

| parent         |
| -------------- |
| parent_id (PK) |
| name           |

| child          |
| -------------- |
| child_id (PK)  |
| name           |
| parent_id (FK) |

---

## **🔌 Hibernate Configuration**

Configured in `hibernate.cfg.xml`

* MySQL dialect
* JDBC URL
* Username & password
* Entity mappings

---

## **⚙️ Build & Run**

1. Import project as **Maven Project**
2. Update Maven dependencies
3. Configure database in `hibernate.cfg.xml`
4. Run the main application
5. Hibernate creates and manages tables
6. Data is persisted automatically

---

## **📈 Application Workflow**

1. Create Parent entity
2. Add multiple Child entities
3. Associate children with parent
4. Persist parent
5. Hibernate stores all records in one transaction

---

## **📊 Sample Scenario**

One **Department** has multiple **Employees**:

| Department | Employees          |
| ---------- | ------------------ |
| IT         | Neha, Arjun |
| HR         | Pooja, Aman        |

---



Just let me know 🚀
