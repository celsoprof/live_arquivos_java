package br.com.fiap.lista_files.dao.impl;

import br.com.fiap.lista_files.dao.GameDao;
import br.com.fiap.lista_files.model.Game;

import java.io.IOException;
import java.nio.file.*;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class GameDaoImpl implements GameDao {

    private final Path arquivo = Paths.get("src/br/com/fiap/lista_files/dados.csv");
    private List<Game> games = new ArrayList<>();

    @Override
    public boolean gravar(Game g) {

        // TODO: Implementar o método para gravar o game.

        return true;

    }

    @Override
    public List<Game> listar() {

        // TODO: Implementar a listagem de games.

        return new ArrayList<>();

    }

    @Override
    public Game buscarGamepeloId(int id) {

        // TODO: Implementar a busca de games pelo ID.

        return new Game();

    }

}
