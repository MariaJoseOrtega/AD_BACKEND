-- Table: public.permisos

-- DROP TABLE IF EXISTS public.permisos;

CREATE SEQUENCE IF NOT EXISTS public.permisos_permiso_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1


CREATE TABLE IF NOT EXISTS public.permisos
(
    permiso_id integer NOT NULL DEFAULT nextval('permisos_permiso_id_seq'::regclass),
    name character varying COLLATE pg_catalog."default",
    type character varying COLLATE pg_catalog."default",
    description character varying COLLATE pg_catalog."default",
    created timestamp with time zone,
    updated timestamp with time zone,
    enabled boolean,
    CONSTRAINT permisos_pkey PRIMARY KEY (permiso_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.permisos
    OWNER to postgres;