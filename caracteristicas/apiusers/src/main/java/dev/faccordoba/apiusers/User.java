package dev.faccordoba.apiusers;


//TODO: puede ocurrir que no necesitemos devolver todos los campos de la entidad
// en ese caso podemos crear un DTO (Data Transfer Object) para definir los campos que queremos
// devolver en la respuesta de la API
public record User(
        Integer id,
        String name,
        String email
     // aqui podemos agregar mas campos si es necesario
) {
}
