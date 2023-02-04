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

  @GetMapping("/{id}")
  public Optional<Player> getPlayerById(@PathVariable("id") Integer id) {
    return playerRepository.findById(id);
  }

  @PostMapping
  public Player createPlayer(@RequestBody Player player) {
    return playerRepository.save(player);
  }

  @PutMapping("/{id}")
  public Player updatePlayer(@PathVariable Integer id, @RequestBody Player player) {
    player.setId(id);
    return playerRepository.save(player);
  }

  @DeleteMapping("/{id}")
  public void deletePlayer(@PathVariable("id") Integer id) {
    playerRepository.deleteById(id);
  }
}

