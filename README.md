# Java-Spring-boot
## Why Hibernate Over JDBC

1. **No Manual SQL** — JDBC requires you to write SQL for every operation. Hibernate auto-generates it; you just call `session.persist()`, `session.get()` etc.

2. **Object Oriented Approach** — JDBC makes you think in tables and rows. Hibernate lets you think purely in Java objects and maps them to tables automatically via `@Entity`.

3. **Database Portability** — Switching databases (PostgreSQL → MySQL) in JDBC means rewriting all SQL queries. In Hibernate, just change one line in `hibernate.cfg.xml`.

4. **Built-in Caching** — JDBC hits the database on every call. Hibernate has built-in caching so repeated requests for same data are served from memory, improving performance.

5. **Relationship Management** — Managing table relationships (one-to-many, many-to-many) in JDBC requires complex JOIN queries written manually. Hibernate handles it cleanly with annotations like `@OneToMany`, `@ManyToMany`.
