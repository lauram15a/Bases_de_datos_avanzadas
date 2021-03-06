PGDMP     .    /                x           tienda    12.0    12.0     0           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            1           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            2           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            3           1262    35696    tienda    DATABASE     ?   CREATE DATABASE tienda WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Spain.1252' LC_CTYPE = 'Spanish_Spain.1252';
    DROP DATABASE tienda;
                postgres    false            ?            1259    35730 	   Productos    TABLE     ?   CREATE TABLE public."Productos" (
    "Codigo_de_barras" character varying NOT NULL,
    "Nombre" text,
    "Tipo" character varying,
    "Descripcion" text,
    "Precio" integer
);
    DROP TABLE public."Productos";
       public         heap    postgres    false            ?            1259    35720    Ticket    TABLE     ?   CREATE TABLE public."Ticket" (
    "N_de_ticket" integer NOT NULL,
    "Importe" integer,
    fecha date,
    "codigo_trabajador_Trabajador" integer
);
    DROP TABLE public."Ticket";
       public         heap    postgres    false            ?            1259    35738    Ticket_Productos    TABLE     ?   CREATE TABLE public."Ticket_Productos" (
    "Cantidad" smallint,
    "Codigo_de_barras_Productos" character varying NOT NULL,
    "N_de_ticket_Ticket" integer NOT NULL
);
 &   DROP TABLE public."Ticket_Productos";
       public         heap    postgres    false            ?            1259    35697    Tienda    TABLE     ?   CREATE TABLE public."Tienda" (
    "Id_tienda" integer NOT NULL,
    "Nombre" text,
    "Ciudad" text,
    "Barrio" text,
    "Provincia" text
);
    DROP TABLE public."Tienda";
       public         heap    postgres    false            ?            1259    35756    Tienda_Productos    TABLE     ?   CREATE TABLE public."Tienda_Productos" (
    "Id_tienda_Tienda" integer NOT NULL,
    "Codigo_de_barras_Productos" character varying NOT NULL,
    "Stock" smallint
);
 &   DROP TABLE public."Tienda_Productos";
       public         heap    postgres    false            ?            1259    35705 
   Trabajador    TABLE       CREATE TABLE public."Trabajador" (
    codigo_trabajador integer NOT NULL,
    "DNI" character varying(9),
    "Nombre" character varying,
    "Apellidos" character varying,
    "Puesto" character varying,
    "Salario" integer,
    "Id_tienda_Tienda" integer NOT NULL
);
     DROP TABLE public."Trabajador";
       public         heap    postgres    false            +          0    35730 	   Productos 
   TABLE DATA           d   COPY public."Productos" ("Codigo_de_barras", "Nombre", "Tipo", "Descripcion", "Precio") FROM stdin;
    public          postgres    false    205   [%       *          0    35720    Ticket 
   TABLE DATA           c   COPY public."Ticket" ("N_de_ticket", "Importe", fecha, "codigo_trabajador_Trabajador") FROM stdin;
    public          postgres    false    204   x%       ,          0    35738    Ticket_Productos 
   TABLE DATA           l   COPY public."Ticket_Productos" ("Cantidad", "Codigo_de_barras_Productos", "N_de_ticket_Ticket") FROM stdin;
    public          postgres    false    206   ?%       (          0    35697    Tienda 
   TABLE DATA           Z   COPY public."Tienda" ("Id_tienda", "Nombre", "Ciudad", "Barrio", "Provincia") FROM stdin;
    public          postgres    false    202   ?%       -          0    35756    Tienda_Productos 
   TABLE DATA           g   COPY public."Tienda_Productos" ("Id_tienda_Tienda", "Codigo_de_barras_Productos", "Stock") FROM stdin;
    public          postgres    false    207   ?%       )          0    35705 
   Trabajador 
   TABLE DATA           ?   COPY public."Trabajador" (codigo_trabajador, "DNI", "Nombre", "Apellidos", "Puesto", "Salario", "Id_tienda_Tienda") FROM stdin;
    public          postgres    false    203   &       ?
           2606    35714    Trabajador DNI_UNIQUE 
   CONSTRAINT     U   ALTER TABLE ONLY public."Trabajador"
    ADD CONSTRAINT "DNI_UNIQUE" UNIQUE ("DNI");
 C   ALTER TABLE ONLY public."Trabajador" DROP CONSTRAINT "DNI_UNIQUE";
       public            postgres    false    203            ?
           2606    35737    Productos Productos_pk 
   CONSTRAINT     h   ALTER TABLE ONLY public."Productos"
    ADD CONSTRAINT "Productos_pk" PRIMARY KEY ("Codigo_de_barras");
 D   ALTER TABLE ONLY public."Productos" DROP CONSTRAINT "Productos_pk";
       public            postgres    false    205            ?
           2606    35745 $   Ticket_Productos Ticket_Productos_pk 
   CONSTRAINT     ?   ALTER TABLE ONLY public."Ticket_Productos"
    ADD CONSTRAINT "Ticket_Productos_pk" PRIMARY KEY ("N_de_ticket_Ticket", "Codigo_de_barras_Productos");
 R   ALTER TABLE ONLY public."Ticket_Productos" DROP CONSTRAINT "Ticket_Productos_pk";
       public            postgres    false    206    206            ?
           2606    35724    Ticket Ticket_pk 
   CONSTRAINT     ]   ALTER TABLE ONLY public."Ticket"
    ADD CONSTRAINT "Ticket_pk" PRIMARY KEY ("N_de_ticket");
 >   ALTER TABLE ONLY public."Ticket" DROP CONSTRAINT "Ticket_pk";
       public            postgres    false    204            ?
           2606    35763 $   Tienda_Productos Tienda_Productos_pk 
   CONSTRAINT     ?   ALTER TABLE ONLY public."Tienda_Productos"
    ADD CONSTRAINT "Tienda_Productos_pk" PRIMARY KEY ("Id_tienda_Tienda", "Codigo_de_barras_Productos");
 R   ALTER TABLE ONLY public."Tienda_Productos" DROP CONSTRAINT "Tienda_Productos_pk";
       public            postgres    false    207    207            ?
           2606    35704    Tienda Tienda_pk 
   CONSTRAINT     [   ALTER TABLE ONLY public."Tienda"
    ADD CONSTRAINT "Tienda_pk" PRIMARY KEY ("Id_tienda");
 >   ALTER TABLE ONLY public."Tienda" DROP CONSTRAINT "Tienda_pk";
       public            postgres    false    202            ?
           2606    35712    Trabajador Trabajador_pk 
   CONSTRAINT     i   ALTER TABLE ONLY public."Trabajador"
    ADD CONSTRAINT "Trabajador_pk" PRIMARY KEY (codigo_trabajador);
 F   ALTER TABLE ONLY public."Trabajador" DROP CONSTRAINT "Trabajador_pk";
       public            postgres    false    203            ?
           2606    35751    Ticket_Productos Productos_fk    FK CONSTRAINT     ?   ALTER TABLE ONLY public."Ticket_Productos"
    ADD CONSTRAINT "Productos_fk" FOREIGN KEY ("Codigo_de_barras_Productos") REFERENCES public."Productos"("Codigo_de_barras") MATCH FULL ON UPDATE CASCADE ON DELETE CASCADE;
 K   ALTER TABLE ONLY public."Ticket_Productos" DROP CONSTRAINT "Productos_fk";
       public          postgres    false    2719    205    206            ?
           2606    35769    Tienda_Productos Productos_fk    FK CONSTRAINT     ?   ALTER TABLE ONLY public."Tienda_Productos"
    ADD CONSTRAINT "Productos_fk" FOREIGN KEY ("Codigo_de_barras_Productos") REFERENCES public."Productos"("Codigo_de_barras") MATCH FULL ON UPDATE CASCADE ON DELETE CASCADE;
 K   ALTER TABLE ONLY public."Tienda_Productos" DROP CONSTRAINT "Productos_fk";
       public          postgres    false    2719    205    207            ?
           2606    35746    Ticket_Productos Ticket_fk    FK CONSTRAINT     ?   ALTER TABLE ONLY public."Ticket_Productos"
    ADD CONSTRAINT "Ticket_fk" FOREIGN KEY ("N_de_ticket_Ticket") REFERENCES public."Ticket"("N_de_ticket") MATCH FULL ON UPDATE CASCADE ON DELETE CASCADE;
 H   ALTER TABLE ONLY public."Ticket_Productos" DROP CONSTRAINT "Ticket_fk";
       public          postgres    false    204    206    2717            ?
           2606    35715    Trabajador Tienda_fk    FK CONSTRAINT     ?   ALTER TABLE ONLY public."Trabajador"
    ADD CONSTRAINT "Tienda_fk" FOREIGN KEY ("Id_tienda_Tienda") REFERENCES public."Tienda"("Id_tienda") MATCH FULL ON UPDATE CASCADE ON DELETE RESTRICT;
 B   ALTER TABLE ONLY public."Trabajador" DROP CONSTRAINT "Tienda_fk";
       public          postgres    false    203    202    2711            ?
           2606    35764    Tienda_Productos Tienda_fk    FK CONSTRAINT     ?   ALTER TABLE ONLY public."Tienda_Productos"
    ADD CONSTRAINT "Tienda_fk" FOREIGN KEY ("Id_tienda_Tienda") REFERENCES public."Tienda"("Id_tienda") MATCH FULL ON UPDATE CASCADE ON DELETE CASCADE;
 H   ALTER TABLE ONLY public."Tienda_Productos" DROP CONSTRAINT "Tienda_fk";
       public          postgres    false    207    2711    202            ?
           2606    35725    Ticket Trabajador_fk    FK CONSTRAINT     ?   ALTER TABLE ONLY public."Ticket"
    ADD CONSTRAINT "Trabajador_fk" FOREIGN KEY ("codigo_trabajador_Trabajador") REFERENCES public."Trabajador"(codigo_trabajador) MATCH FULL ON UPDATE CASCADE ON DELETE SET NULL;
 B   ALTER TABLE ONLY public."Ticket" DROP CONSTRAINT "Trabajador_fk";
       public          postgres    false    203    204    2715            +      x?????? ? ?      *      x?????? ? ?      ,      x?????? ? ?      (   -   x??????҂??|N?Ĕ??N?ĢĤļ????W? ]%-      -      x?????? ? ?      )      x?????? ? ?     