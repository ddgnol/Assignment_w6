package com.example.listviewexample_dtl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.bloco.faker.Faker;

public class MainActivity extends AppCompatActivity {
    List<MailModel> mails;
    String[] name = {"Hugh Littel", "Laverna Ledner","Nick McClure","Bennett Dibbert","Mrs. Blaze Schroeder","Chyna Rosenbaum PhD",
                    "Johathan Ritchie","Trinity Durgan","Shanon Barrows","Gertrude Roberts","Elyssa Wolf","Miss Karlee Cruickshank" };
    String[] subject = {
            "Et rerum earum quibusdam ipsum dolores et debitis asperiores.",
            "Libero unde accusantium aut exercitationem reprehenderit rerum beatae sed.",
            "Consectetur eos facilis ullam ullam.",
            "Voluptate aspernatur quam ipsam aliquam fugit quia et quas.",
            "Rerum molestiae quidem atque et.",
            "Quia quod autem eos quos voluptas quos fugit.",
            "Qui voluptas veritatis ab quia tempore qui et.",
            "Optio fuga omnis error et et voluptatem.",
            "Aliquam itaque eius omnis velit repellat id assumenda voluptatibus aspernatur.",
            "Impedit deleniti et perferendis quod voluptatem soluta.",
            "Sequi vel fuga tempora mollitia velit repudiandae sapiente ea deleniti.",
            "Officia earum harum recusandae excepturi fuga."
    };
    String[] content={
            "Dolores voluptatem velit dolorem natus consequuntur eum sed sunt placeat. Odit sunt molestiae omnis earum amet asperiores culpa placeat dolores. ",
            "Doloribus voluptatem qui aspernatur debitis ea. Nihil reiciendis minus id commodi. Porro unde qui sit. In labore tenetur voluptas suscipit rerum officiis ex.",
            "Sapiente magni sit eaque quaerat ut repellat. Nisi laborum est dignissimos perspiciatis quia. Dolore voluptas ratione praesentium eos quia veritatis perferendis eum blanditiis.",
            "Expedita reprehenderit blanditiis cum sed nihil omnis. Excepturi et suscipit enim repudiandae pariatur et harum. Dolorem et autem rerum voluptatum asperiores.",
            "Accusantium quisquam iusto ut porro commodi quia natus et. Autem voluptas officiis accusamus facilis. Corrupti debitis similique aut. Soluta iusto excepturi nostrum voluptates quo sunt ipsam.",
            "Consequatur minima aut est rerum. Quia quisquam officiis excepturi enim voluptatem quaerat laboriosam natus qui. Fugiat iure ab ut est libero rem animi. ",
            "Aut itaque et consequatur quidem ut adipisci nisi. Qui ea corporis quo voluptatem dolor nihil aperiam sequi nisi. Eius et eum praesentium iste repellendus dolorum.",
            "Eos exercitationem et ratione quibusdam quasi minus consequatur sit. Ea est illum consequatur aut voluptates labore repellat asperiores.",
            "Debitis eligendi ipsa consequatur quam non aut nisi quasi ipsa. Sint doloribus ut ratione aliquam fuga veniam. Voluptas dignissimos repellat dolor illum perspiciatis adipisci.",
            "Explicabo iste voluptatibus dicta veritatis. Ipsam incidunt eum dolore porro eligendi fugiat et et explicabo.",
            "Nobis vel velit maxime consequatur doloribus sit consequatur officia sapiente. Ad nisi alias laborum sed. ",
            "Optio qui quo dicta a. Consectetur veritatis et doloribus nihil quaerat voluptatum."
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mails = new ArrayList<>();
        for(int i = 0; i<12; i++){
//            Faker faker = new Faker();
//            String name = faker.name.name();
//            String subject = faker.lorem.sentence();
//            String content = faker.lorem.paragraph();
//            Log.d("item", name+"-"+subject+"-"+content);
            mails.add(new MailModel(name[i],subject[i],content[i],false));
        }
        MailAdapter adapter = new MailAdapter(mails);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
