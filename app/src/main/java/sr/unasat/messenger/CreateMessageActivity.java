package sr.unasat.messenger;

/*
Head First Android Development 2nd Edition

Chapter 3

The Messenger

Type message in first activity, click button, and display message in second activity

The app contains two activities and two layouts.
- When the app gets launched, it starts activity "CreateMessageActivity.java".
This activity uses the layout "activity_create_message.xml".

- When the user clicks a button in "CreateMessageActivity.java",
"ReceiveMessageActivity.java" is launched.
This activity uses layout "activity_receive_message.xml".
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    // Call onSendMessage() when the button is clicked
    public void onSendMessage(View view) {
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
        startActivity(intent);
    }
}