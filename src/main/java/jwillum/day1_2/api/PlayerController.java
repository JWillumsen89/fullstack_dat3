package jwillum.day1_2.api;

import jwillum.day1_2.entity.Player;
import jwillum.day1_2.repositories.PlayerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/players")
public class PlayerController {


  PlayerRepository playerRepository;

//Test comment -
  public PlayerController(PlayerRepository playerRepository) {
    this.playerRepository = playerRepository;
  }

  @GetMapping
  Iterable<Player> getPlayers() {
    return playerRepository.findAll();
  }

}

