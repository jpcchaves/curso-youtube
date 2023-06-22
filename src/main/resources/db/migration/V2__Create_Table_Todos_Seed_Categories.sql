CREATE TABLE
    public.todos
(
    id           bigserial                      NOT NULL,
    concluded    boolean                        NOT NULL,
    concluded_at timestamp(6) without time zone NULL,
    created_at   timestamp(6) without time zone NULL,
    deadline     timestamp(6) without time zone NULL,
    todo         character varying(255)         NULL,
    updated_at   timestamp(6) without time zone NULL,
    category_id  bigint                         NULL
);

ALTER TABLE
    public.todos
    ADD
        CONSTRAINT todos_pkey PRIMARY KEY (id);

INSERT INTO
    public.categories ("name")
VALUES
    ('Trabalho'),
    ('Casa'),
    ('Lazer'),
    ('Outro');