package apascualco.blog.springbootrest.controladores;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ControladorHolaMundo {

    @RequestMapping(value = "/saludar/{nombre}", method = RequestMethod.GET)
    public @ResponseBody String saludar(@PathVariable("nombre") String nombre) {
        return "Hola mundo!!  " + nombre;
    }

}
