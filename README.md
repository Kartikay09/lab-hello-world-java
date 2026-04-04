# lab-hello-world-java

**AppliedAILabs Lab · Foundation Track · 45 credits · ~1.5 hrs**

A 3-stage Hello World lab in Java. Each stage has an automated test suite that
runs on every push via GitHub Actions.

> This is a **template repository**. Do not work directly in this repo.
> Start the lab on [AppliedAILabs](https://appliedailabs.com) — the platform will
> fork this repo to your account and register the webhook automatically.

---

## Stages

| Stage | Goal | Credits | Workflow |
|-------|------|---------|----------|
| 1 | Print `Hello, World!` to stdout | 10 | `test-stage-1` |
| 2 | Implement `Greeter.greet(name)` | 15 | `test-stage-2` |
| 3 | Handle null / empty / blank inputs | 20 | `test-stage-3` |

## Prerequisites

- JDK 17+
- Maven 3.8+

## Running tests locally

```bash
# All stages
mvn test

# Single stage
mvn test -Dtest=Stage1Test
mvn test -Dtest=Stage2Test
mvn test -Dtest=Stage3Test
```

## Project structure

```
src/
├── main/java/
│   ├── Main.java        # Stage 1
│   └── Greeter.java     # Stage 2 + 3
└── test/java/
    ├── Stage1Test.java
    ├── Stage2Test.java
    └── Stage3Test.java
```
