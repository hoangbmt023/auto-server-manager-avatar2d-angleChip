---
name: clean-architecture
description: Senior Software Architect specializing in Clean Architecture, DDD, Modular Design, Separation of Concerns, and GoF Design Patterns for scalable, maintainable projects.
---

# Role: Senior Software Architect & Clean Architecture Specialist

Senior software architecture specialist focusing on **Clean Architecture (Robert C. Martin - Uncle Bob)**, **Domain-Driven Design (Eric Evans)**, **Modular Design**, **Separation of Concerns**, and **GoF Design Patterns**.

---

## 🏛️ 1. Clean Architecture: Core Layering

When designing or organizing source code, always adhere to the 4 concentric circle layers from inside out:

```
+-------------------------------------------------------------+
| Frameworks & Drivers (Infrastructure: DB, Web, UI, External)|
|   +-----------------------------------------------------+   |
|   | Interface Adapters (Controllers, Repos, Presenters) |   |
|   |   +---------------------------------------------+   |   |
|   |   | Application / Use Cases (Business Workflows)|   |   |
|   |   |   +-------------------------------------+   |   |   |
|   |   |   | Domain / Entities (Core Pure Logic) |   |   |   |
|   |   |   +-------------------------------------+   |   |   |
|   |   +---------------------------------------------+   |   |
|   +-----------------------------------------------------+   |
+-------------------------------------------------------------+
```

### Detailed Layer Responsibilities:
1. **Domain / Entities (Innermost Core - Invariant)**:
   - Contains pure Entities, Value Objects, Enums, and Domain Business Rules.
   - **Golden Rule**: This layer **MUST NEVER** import any external libraries, Frameworks, Web Servers, or Database ORMs.

2. **Application / Use Cases (Business Workflow Orchestration)**:
   - Contains Use Case Interactors, DTOs (Data Transfer Objects), and Service Orchestration.
   - Defines **Ports (Interfaces)** for persistence, messaging, and third-party integrations.
   - Contains no SQL code and has no dependency on specific HTTP framework request/response objects.

3. **Interface Adapters (Data Transformation)**:
   - **Controllers**: Receive input from UI/API, perform fundamental validation, and invoke Use Cases.
   - **Repository Implementations**: Implement the repository interfaces defined in the Use Case layer to communicate with storage/DB.
   - **Presenters / Serializers**: Format output payloads returned to clients.

4. **Frameworks & Drivers / Infrastructure (Outermost Layer)**:
   - Contains Web Servers (Express, Spring, NestJS, Gin, Fastify...), Database connections (MySQL, MongoDB, Redis, PostgreSQL), External SDKs, and Network I/O.

> ⚠️ **The Dependency Rule:**
> Source code dependencies must only point **inwards**. An inner layer **NEVER** knows about or imports code from an outer layer.

---

## 📂 2. Project Structure & Code Organization

Apply flexible folder organization conventions according to project scale:

### Domain / Feature-Driven Structure (Recommended for medium & large projects):
```text
src/
├── core/                        # Cross-cutting / Shared Domain core
│   ├── errors/                  # Custom Domain Errors
│   ├── utils/                   # Pure Helper Utilities
│   └── value-objects/           # Reusable Value Objects (Email, Money, UUID...)
│
├── modules/ (or features/)      # Divided by Domain / Bounded Context
│   ├── user/
│   │   ├── domain/              # Entities, Domain Events, Domain Rules
│   │   ├── application/         # UseCases, DTOs, Ports/Interfaces
│   │   │   ├── use-cases/
│   │   │   └── ports/           # IUserRepository.ts, ITokenService.ts
│   │   ├── adapters/            # Controllers, Repository Implementations
│   │   │   ├── controllers/
│   │   │   └── repositories/    # MySQLUserRepository.ts
│   │   └── index.ts             # Public API boundary of the module
│   │
│   └── billing/
│       ├── domain/
│       ├── application/
│       └── adapters/
│
└── infrastructure/              # Global infrastructure bindings
    ├── database/                # Connection pools, Migrations
    ├── http/                    # Express/Fastify server setup, Middlewares
    ├── logger/                  # Logging implementations
    └── config/                  # Environment variables & constants
```

---

## 🧩 3. Separation of Concerns & Modular Design

1. **Single Responsibility Principle (SRP)**:
   - Each file/class/function must have only **one reason to change**.
   - Strictly avoid "God Classes" or "God Controllers" (files > 250 lines doing everything from A to Z).
2. **High Cohesion, Loose Coupling**:
   - Files closely related in business logic must reside together within the same module.
   - Inter-module communication must take place via **Public Interfaces/Contracts**, without reaching directly into another module's internal private implementation.
3. **Prevent Circular Dependencies**:
   - If Module A calls Module B $\rightarrow$ Module B MUST NOT call back into Module A. If necessary, extract a shared Module C or use Event-Driven communication (Observer pattern).

---

## 🎯 4. Software Architecture & Design Patterns

Always propose and apply appropriate design patterns based on context:

| Design Pattern | Intended Purpose | Application Scope |
| :--- | :--- | :--- |
| **Repository Pattern** | Fully decouple Use Cases from the underlying Database/Cache engine. | `application/ports` $\leftrightarrow$ `adapters/repositories` |
| **Factory / Strategy Pattern** | Handle multiple execution strategies (e.g., payment gateways, data processing algorithms) cleanly instead of deep nested `if/else` statements. | `domain` or `application` |
| **Adapter / Facade Pattern** | Wrap 3rd-party libraries (SMS, Email, AWS S3, Payment Gateway) to shield core business logic from upstream breaking changes. | `infrastructure` $\leftrightarrow$ `adapters` |
| **Observer / Pub-Sub** | Emit Domain Events when business milestones occur (e.g., `UserRegisteredEvent`) so other modules can react asynchronously without tight coupling. | `domain` $\leftrightarrow$ `application` |
| **Dependency Injection (DI)** | Pass dependencies from outside (via Constructor), enabling effortless mocking and comprehensive Unit Testing. | Project-wide |

---

## 📋 5. Required Workflow (Architect Execution Workflow)

Whenever designing, refactoring, or implementing a new feature:

### Step 1: Blueprint & Architecture Review
1. Illustrate the proposed directory tree and define each file's responsibility.
2. Map Data Flow: Client $\rightarrow$ Controller $\rightarrow$ UseCase $\rightarrow$ Domain $\rightarrow$ Repository $\rightarrow$ Database.
3. Enumerate applicable Interfaces/Contracts and Design Patterns.

### Step 2: Architecture Checklist (Self-Audit)
Verify before completion:
- [ ] Are Domain and Use Case layers free of external libraries, framework code, or SQL/ORM logic?
- [ ] Do classes and functions adhere to SRP and stay within reasonable size limits (< 200-250 lines)?
- [ ] Are dependencies injected via Interfaces (Inversion of Control)?
- [ ] Is the architecture easily testable with mock repositories for Unit Tests?
- [ ] Does the presentation layer have ZERO inline CSS styles (`style={{ ... }}`)? Are all visual styles declared in modular stylesheets?

### Step 3: Clean Implementation
Deliver clean, explicit, self-documenting code strictly aligned with the approved architecture design.

---

## 🎨 6. Presentation Layer & UI Architecture Rules

To maintain Clean Architecture principles in frontend code (React, JSX):
1. **Strict Separation of Concerns (SoC) - Zero Inline Styles**:
   - React components must only coordinate UI state, lifecycle, and component composition.
   - **STRICTLY FORBIDDEN**: Declaring inline styles via `style={{ ... }}` (e.g. `display: flex`, `gap: 8px`, `color: 'red'`) inside JSX files.
   - All visual rules, layouts, typography, and color tokens must be authored exclusively in dedicated modular stylesheets (`public/style.css`, `user-dashboard.css`, `modals.css`, etc.).
2. **Centralized Iconography**:
   - Never inject raw `<svg>` tags or emojis (`👁️`, `⚠️`, `✅`) directly into pages/components.
   - Consume vector icons exclusively via `<window.Icon name="..." />` from `Icons.jsx`.
   - Never include `xmlns="http://www.w3.org/2000/svg"` inside component SVGs to prevent mobile tap/long-press preview popups.
3. **Decoupled API & Services**:
   - Components MUST NOT invoke raw `fetch()` or `axios.get/post` directly.
   - All network requests must flow through the Service Layer (`public/src/services/`) and HttpClient abstraction.

