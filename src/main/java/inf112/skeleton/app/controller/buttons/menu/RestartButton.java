package inf112.skeleton.app.controller.buttons.menu;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import inf112.skeleton.app.controller.buttons.ButtonFactory;
import inf112.skeleton.app.controller.buttons.Buttons;

import inf112.skeleton.app.model.SkadedyrModel;

public class RestartButton  extends Buttons {
    public RestartButton(SkadedyrModel model, Stage stage) {
        super(model, stage);
    }

    @Override
    protected void setupButton() {
        button = ButtonFactory.createImageButton("claw.png", "snow.png");
        button.setSize(100, 100);
        button.setPosition(1000, 600);

        button.addListener(new ClickListener() {
            @Override
            public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
                model.restart();
            }
        });

    }

    @Override
    public void updateButtonAppearance() {

    }
            
}