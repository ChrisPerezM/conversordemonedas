
# Challenge conversor divisas

En una pequeña aplicación de consola, en la cual por medio de un menú de opciones, el usuario podrá convertir de una divisa base a otra.


## Screenshots

![Git Hub](https://github.com/ChrisPerezM/conversordemonedas/blob/main/Captura%20de%20pantalla%202024-04-21%20142819.png)


## API Reference

#### Get all items

```http
  GET /api/items
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. 8409015d7b4becdaae45350d |

#### Get item

```http
  GET /api/pair/${conversion}/${convertido}/${cantidad}
```

| Parameter   | Type     | Description                       |
| :--------   | :------- | :-------------------------------- |
| `conversion`| `string` | **Required**. Tipo de moneda para convertir. Ejemplo "USD" |
| `convertido`| `string` | **Required**. Tipo de moneda a convertir. Ejemplo "ARS" |
| `cantidad`| `int` | **Required**. Número que especifica la cantidad a convertir de la divisa. |




## Authors

- [@ChrisPerezM](https://github.com/ChrisPerezM)

