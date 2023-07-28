package com.example.YoutubersLol.Controllers;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.YoutubersLol.models.jugadorModel;
import com.example.YoutubersLol.service.jugadorservice;



@RestController
@RequestMapping
public class jugadorcontroller {
    @Autowired
    jugadorservice jugadorService;
    @PostMapping("/crear")
    public jugadorModel guardaJugadorModel(@RequestBody jugadorModel jugador){
        return this.jugadorService.guardar(jugador);
    } @GetMapping("/todo")
    public ArrayList<jugadorModel>obtenerToJugadorModels(){
        return jugadorService.obtenerjugadores();
    }
    @GetMapping(path = "/{Id}")
    public Optional<jugadorModel> obtenerjugadorModel(@PathVariable("Id") Integer Id){
        return this.jugadorService.obtenerporId(Id);
    }
    @DeleteMapping(path = "/{Id}")
    public String eliminarjugador(@PathVariable("Id") Integer Id){
        boolean ok=this.jugadorService.eliminar(Id);
        if (ok){
            return "El jugador fue eliminado, su id es: " + Id;
        }
        else{
            return "El jugador no se encuentra en el registro";
        }
    }
}
