
CREATE TABLE car (
    id SERIAL PRIMARY KEY ,
    сar_name CHARACTER VARYING(50) NOT NULL,
    amountOfGasoline int
    );

CREATE TABLE order_gas(
    id SERIAL PRIMARY KEY,
    create_date DATE NOT NULL,
    car_id int NOT NULL,
    price_id int NOT NULL,
    FOREIGN KEY (car_id) REFERENCES  car (id),
    FOREIGN KEY (price_id) REFERENCES  price (id)
    );

CREATE TABLE price(
    id SERIAL PRIMARY KEY,
    gasolineType CHARACTER VARYING(50) NOT NULL,
    price INTEGER  NOT NULL,
    wholesalePrice INTEGER  NOT NULL,
    order_id int NOT NULL,
    FOREIGN KEY (order_id) REFERENCES  order_gas (id)
    );

CREATE TABLE remains_gas(
    track_id SERIAL PRIMARY KEY,
    gasolineType CHARACTER VARYING(50) NOT NULL,
    amountGas INTEGER  NOT NULL
    );

