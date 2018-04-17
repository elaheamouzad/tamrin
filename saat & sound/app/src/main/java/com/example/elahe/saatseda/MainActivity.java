package com.example.elahe.saatseda;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Date;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler handler=new Handler();


        final TextView saat = (TextView) findViewById(R.id.t1);
        final TextView daghighe = (TextView) findViewById(R.id.t2);
        final TextView sanie = (TextView) findViewById(R.id.t3);

        Button b1 = (Button) findViewById(R.id.btn1);

        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.one);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.two);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.three);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.four);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.five);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.six);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.seven);
        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.eight);
        final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.nine);
        final MediaPlayer mp10 = MediaPlayer.create(this, R.raw.ten);
        final MediaPlayer mp11 = MediaPlayer.create(this, R.raw.eleven);
        final MediaPlayer mp12 = MediaPlayer.create(this, R.raw.twelve);
        final MediaPlayer mp13 = MediaPlayer.create(this, R.raw.thirteen);
        final MediaPlayer mp14 = MediaPlayer.create(this, R.raw.fourteen);
        final MediaPlayer mp15 = MediaPlayer.create(this, R.raw.fifteen);
        final MediaPlayer mp16 = MediaPlayer.create(this, R.raw.sixteen);
        final MediaPlayer mp17 = MediaPlayer.create(this, R.raw.seventeen);
        final MediaPlayer mp18 = MediaPlayer.create(this, R.raw.eighteen);
        final MediaPlayer mp19 = MediaPlayer.create(this, R.raw.nineteen);
        final MediaPlayer mp20 = MediaPlayer.create(this, R.raw.twenty);
        final MediaPlayer mp20o = MediaPlayer.create(this, R.raw.bisto);
        final MediaPlayer mp30 = MediaPlayer.create(this, R.raw.thirty);
        final MediaPlayer mp30o = MediaPlayer.create(this, R.raw.sio);
        final MediaPlayer mp40 = MediaPlayer.create(this, R.raw.fourty);
        final MediaPlayer mp40o = MediaPlayer.create(this, R.raw.chehelo);
        final MediaPlayer mp50 = MediaPlayer.create(this, R.raw.fifty);
        final MediaPlayer mp50o = MediaPlayer.create(this, R.raw.panjaho);
        final MediaPlayer clock = MediaPlayer.create(this, R.raw.clock);
        final MediaPlayer san = MediaPlayer.create(this, R.raw.secend);
        final MediaPlayer min = MediaPlayer.create(this, R.raw.minute);


               /************************************************************************/

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date d = new Date();
                final int h = d.getHours();
                final int m = d.getMinutes();
                final int s = d.getSeconds();
                final int h2 = h - 12;
                saat.setText(String.valueOf(h));
                daghighe.setText(String.valueOf(m));
                sanie.setText(String.valueOf(s));

                clock.start();

                switch (h) {
                    case 1:
                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp1.start();

                            }
                        });
                        break;

                    case 2:
                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp2.start();

                            }
                        });
                        break;

                    case 3:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp3.start();

                            }
                        });
                        break;

                    case 4:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp4.start();

                            }
                        });
                        break;

                    case 5:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp5.start();

                            }
                        });
                        break;

                    case 6:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp6.start();

                            }
                        });
                        break;
                    case 7:
                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp7.start();

                            }
                        });
                        break;
                    case 8:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp8.start();

                            }
                        });
                        break;

                    case 9:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp9.start();

                            }
                        });
                        break;

                    case 10:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp10.start();

                            }
                        });
                        break;

                    case 11:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp11.start();

                            }
                        });
                        break;

                    case 12:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp12.start();

                            }
                        });
                        break;
                    case 13:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp13.start();

                            }
                        });
                        break;

                    case 14:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp14.start();

                            }
                        });
                        break;
                    case 15:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp15.start();

                            }
                        });
                        break;
                    case 16:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp16.start();

                            }
                        });
                        break;
                    case 17:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp17.start();

                            }
                        });
                        break;
                    case 18:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp18.start();

                            }
                        });
                        break;
                    case 19:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp19.start();

                            }
                        });
                        break;
                    case 20:

                        clock.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp20.start();

                            }
                        });
                        break;

                }

                /*********************************************/


                switch (m) {
                    case 1:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp1.start();
                                mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                        break;

                    case 2:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp2.start();
                                mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                        break;

                    case 3:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp3.start();
                                mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                        break;

                    case 4:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp4.start();
                                mp4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                        break;

                    case 5:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp5.start();
                                mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                        break;

                    case 6:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp6.start();
                                mp6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                        break;

                    case 7:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp7.start();
                                mp7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                        break;

                    case 8:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp8.start();
                                mp8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                        break;

                    case 9:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp9.start();
                                mp9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);


                        break;

                    case 10:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp10.start();
                                mp10.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);

                    case 11:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp11.start();
                                mp11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                    case 12:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp12.start();
                                mp12.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);

                    case 13:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp13.start();
                                mp13.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);

                    case 14:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp14.start();
                                mp14.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);

                    case 15:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp15.start();
                                mp15.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                    case 16:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp16.start();
                                mp16.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                        break;

                    case 17:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp17.start();
                                mp17.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                    case 18:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp18.start();
                                mp18.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);

                    case 19:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp19.start();
                                mp19.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                        break;

                    case 20:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp20.start();
                                mp20.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 21:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp20o.start();
                                mp20o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp1.start();
                                        mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                    case 22:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp20o.start();
                                mp20o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp2.start();
                                        mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 23:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp20o.start();
                                mp20o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp3.start();
                                        mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 24:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp20o.start();
                                mp20o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp4.start();
                                        mp4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 25:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp20.start();
                                mp20.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp5.start();
                                        mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 26:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp20o.start();
                                mp20o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp6.start();
                                        mp6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 27:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp20o.start();
                                mp20o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp7.start();
                                        mp7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 28:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp20o.start();
                                mp20o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp8.start();
                                        mp8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 29:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp20o.start();
                                mp20o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp9.start();
                                        mp9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;


                    case 30:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp30.start();
                                mp30.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 31:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp30o.start();
                                mp30o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp1.start();
                                        mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                    case 32:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp30o.start();
                                mp30o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp2.start();
                                        mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 33:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp30o.start();
                                mp30o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp3.start();
                                        mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 34:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp30o.start();
                                mp30o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp4.start();
                                        mp4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 35:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp30o.start();
                                mp30o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp5.start();
                                        mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 36:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp30o.start();
                                mp30o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp6.start();
                                        mp6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 37:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp30o.start();
                                mp30o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp7.start();
                                        mp7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 38:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp30o.start();
                                mp30o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp8.start();
                                        mp8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 39:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp30o.start();
                                mp30o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp9.start();
                                        mp9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 40:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp40.start();
                                mp40.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                        break;



                    case 41:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp40o.start();
                                mp40o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp1.start();
                                        mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                    case 42:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp40o.start();
                                mp40o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp2.start();
                                        mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 43:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp40o.start();
                                mp40o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp3.start();
                                        mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 44:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp40o.start();
                                mp40o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp4.start();
                                        mp4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 45:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp40o.start();
                                mp40o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp5.start();
                                        mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 46:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp40o.start();
                                mp40o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp6.start();
                                        mp6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 47:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp40o.start();
                                mp40o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp7.start();
                                        mp7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 48:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp40o.start();
                                mp40o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp8.start();
                                        mp8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 49:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp40o.start();
                                mp40o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp9.start();
                                        mp9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;


                    case 50:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp50.start();
                                mp50.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        min.start();
                                    }
                                });

                            }
                        } , 2000);
                        break;

                    case 51:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp50o.start();
                                mp50o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp1.start();
                                        mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                    case 52:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp50o.start();
                                mp50o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp2.start();
                                        mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 53:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp50o.start();
                                mp50o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp3.start();
                                        mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 54:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp50o.start();
                                mp50o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp4.start();
                                        mp4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 55:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp50o.start();
                                mp50o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp5.start();
                                        mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 56:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp50o.start();
                                mp50o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp6.start();
                                        mp6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 57:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp50o.start();
                                mp50o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp7.start();
                                        mp7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 58:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp50o.start();
                                mp50o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp8.start();
                                        mp8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;
                    case 59:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                mp50o.start();
                                mp50o.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp9.start();
                                        mp9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                min.start();
                                            }
                                        });


                                    }
                                });

                            }
                        } , 2000);
                        break;

                }   //barai sanie ham baiad swith(s) ra mesl daghighe benevisim,bekhatere hajm ziad neveshte nashod//




            }
        });
    }
}



