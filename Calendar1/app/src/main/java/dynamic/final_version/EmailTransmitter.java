package dynamic.final_version;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmailTransmitter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_response);
        Button R1=(Button)findViewById(R.id.notcoming);
      Button R2= (Button)findViewById(R.id.coming);
      Button R3= (Button)findViewById(R.id.myownmessage);
        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail1();
            }
        });

        R2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sendEmail2();
        }
    });
        R3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail3();
            }
        });


    }

    private void sendEmail2() {
        //   String recipentList=  EmailNameSender.getText().toString();
        // String name = Name.getText().toString();
        String uriText =
                "mailto:sebastianhaias98@gmail.com" +
                        "?subject=" + Uri.encode("MEETING") +
                        "&body=" + Uri.encode("Coming");
        Uri uri = Uri.parse(uriText);

        Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
        sendIntent.setData(uri);
        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(sendIntent, "Send message"));
        }

    }
    private void sendEmail3() {
        //   String recipentList=  EmailNameSender.getText().toString();
        // String name = Name.getText().toString();
        String uriText =
                "mailto:sebastianhaias98@gmail.com" +
                        "?subject=" + Uri.encode("MEETING");
        Uri uri = Uri.parse(uriText);

        Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
        sendIntent.setData(uri);
        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(sendIntent, "Send message"));
        }

    }

    private void sendEmail1() {
        //   String recipentList=  EmailNameSender.getText().toString();
        // String name = Name.getText().toString();
        String uriText =
                "mailto:sebastianhaias98@gmail.com" +
                        "?subject=" + Uri.encode("MEETING") +
                        "&body=" + Uri.encode("NOT Coming");
        Uri uri = Uri.parse(uriText);

        Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
        sendIntent.setData(uri);
        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(sendIntent, "Send message"));
        }

    }
    }
