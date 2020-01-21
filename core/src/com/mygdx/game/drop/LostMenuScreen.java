package com.mygdx.game.drop;



import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class LostMenuScreen implements Screen {

    final Drop game;

    OrthographicCamera camera;

    public LostMenuScreen(final Drop game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(255, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font.draw(game.batch, "You Lost!!! ", 300, 250);
        game.font.draw(game.batch, "Your score is: "+game.score, 300, 200);
        game.font.draw(game.batch, "Tap anywhere to retry!", 300, 150);
        game.batch.end();

        if (Gdx.input.justTouched()) {

            game.setScreen(new GameScreen(game));
            dispose();
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

    //Rest of class still omitted...

}