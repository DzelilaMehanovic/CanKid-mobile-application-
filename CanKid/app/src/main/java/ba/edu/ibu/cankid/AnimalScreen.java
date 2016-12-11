package ba.edu.ibu.cankid;

/**
 * Created by muki on 11.11.2016..
 */
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AnimalScreen extends AppCompatActivity {


    public void homeButton(){
    final ImageView homeIcon = (ImageView) findViewById(R.id.homeIcon);
    homeIcon.setOnClickListener(new OnClickListener(){
        public void onClick(View v) {
            Intent animalIntent = new Intent(v.getContext(), MainActivity.class);
            startActivityForResult(animalIntent,0);//MainActivity.this  getApplicationContext()
        }
    });
}


    //click on image, start sound
public void sound(ImageView imageName, final MediaPlayer soundName){
    imageName.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            soundName.start();
        }
    });

}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bird);


        homeButton();
        final MediaPlayer birdSound = MediaPlayer.create(this, R.raw.bird);
        final ImageView birdImage = (ImageView) findViewById(R.id.bird_image);
        sound(birdImage, birdSound);



        final ImageView birdNext = (ImageView) findViewById(R.id.bird_next);
        birdNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.cat);
                homeButton();
                final ImageView catImage = (ImageView) findViewById(R.id.cat_image);
                final MediaPlayer catSound =  MediaPlayer.create(AnimalScreen.this, R.raw.cat);
                sound(catImage, catSound);

                final ImageView catNext = (ImageView) findViewById(R.id.cat_next);
                catNext.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.chicken);
                        homeButton();
                        final MediaPlayer chickenSound = MediaPlayer.create(AnimalScreen.this, R.raw.chicken);
                        final ImageView chickenImage = (ImageView) findViewById(R.id.chicken_image);
                       sound(chickenImage, chickenSound);


                        final ImageView chickenNext = (ImageView) findViewById(R.id.chicken_next);

                        chickenNext.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.cow);
                                homeButton();
                                final ImageView cowImage = (ImageView) findViewById(R.id.cow_image);
                                final MediaPlayer cowSound = MediaPlayer.create(AnimalScreen.this, R.raw.cow);
                              sound(cowImage, cowSound);


                                final ImageView cowNext = (ImageView) findViewById(R.id.cow_next);
                               cowNext.setOnClickListener(new OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.dog);
                                        homeButton();
                                        final ImageView dogImage = (ImageView) findViewById(R.id.dog_image);
                                        final MediaPlayer dogSound = MediaPlayer.create(AnimalScreen.this, R.raw.dog);
                                      sound(dogImage, dogSound);


                                        final ImageView dogNext = (ImageView) findViewById(R.id.dog_next);
                                        dogNext.setOnClickListener(new OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.fish);
                                                homeButton();
                                                final ImageView fishImage = (ImageView) findViewById(R.id.fish_image);
                                                final MediaPlayer fishSound = MediaPlayer.create(AnimalScreen.this, R.raw.fish);
                                                sound(fishImage, fishSound);

                                                final ImageView fishNext = (ImageView) findViewById(R.id.fish_next);
                                                fishNext.setOnClickListener(new OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        setContentView(R.layout.goat);
                                                        homeButton();
                                                        final ImageView goatImage = (ImageView) findViewById(R.id.goat_image);
                                                        final MediaPlayer goatSound = MediaPlayer.create(AnimalScreen.this, R.raw.goat);
                                                        sound(goatImage, goatSound);
                                                        final ImageView goatNext = (ImageView) findViewById(R.id.goat_next);


                                                        goatNext.setOnClickListener(new OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                setContentView(R.layout.horse);
                                                                homeButton();
                                                                final ImageView horseImage = (ImageView) findViewById(R.id.horse_image);
                                                                final MediaPlayer horseSound = MediaPlayer.create(AnimalScreen.this, R.raw.horse);
                                                                sound(horseImage, horseSound);

                                                                final ImageView horseNext = (ImageView) findViewById(R.id.horse_next);
                                                                horseNext.setOnClickListener(new OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {

                                                                        setContentView(R.layout.rabbit);
                                                                        homeButton();
                                                                        final ImageView rabbitImage = (ImageView) findViewById(R.id.rabbit_image);
                                                                        final MediaPlayer rabbitSound = MediaPlayer.create(AnimalScreen.this, R.raw.rabbit);
                                                                        sound(rabbitImage, rabbitSound);

                                                                        final ImageView rabbitNext = (ImageView) findViewById(R.id.rabbit_next);

                                                                        rabbitNext.setOnClickListener(new OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                setContentView(R.layout.sheep);
                                                                                homeButton();
                                                                                final ImageView sheepImage = (ImageView) findViewById(R.id.sheep_image);
                                                                                final MediaPlayer sheepSound = MediaPlayer.create(AnimalScreen.this, R.raw.sheep);
                                                                                sound(sheepImage, sheepSound);
                                                                                homeButton();
                                                                                /*final ImageView sheepNext = (ImageView) findViewById(R.id.sheep_next);


                                                                                sheepNext.setOnClickListener(new OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        setContentView(R.layout.bird);
                                                                                    }
                                                                                });*/

                                                                            }
                                                                        });

                                                                    }
                                                                });
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });

                                    }
                                });
                            }
                        });
                    }
                });


            }
        });

    }
}
