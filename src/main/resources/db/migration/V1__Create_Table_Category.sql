CREATE TABLE
    public.categories (
                          id bigserial NOT NULL,
                          name character varying (100) UNIQUE NOT NULL
);

ALTER TABLE
    public.categories
    ADD
        CONSTRAINT categories_pkey PRIMARY KEY (id)
