package com.example.season4foods;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.os.Bundle;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ResourceBundle;


public class ActivityReceitas extends AppCompatActivity {

    ListView lista_receitas;
    TextView nome_alimento;
    TextView texto_Banco;
    String IngredienteReceita;

    DbHelper db;


    @SuppressLint("SetTeast18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receitas);

        nome_alimento = findViewById(R.id.nome_alimento);
        lista_receitas = findViewById(R.id.lista_receitas);
        texto_Banco = findViewById(R.id.texto_banco);


        //Carregando dados da Intent Main
        Bundle bundle = getIntent().getExtras();
        //assert bundle != null;
        String NomeAlimento = bundle.getString("ingre");
        nome_alimento.setText(NomeAlimento);


        ///BANCO DE DADOS ESQUECEEEE
        /*
        db = new DbHelper(this);
        db.insertReceita(IngredienteReceita);
        texto_Banco.setText("");


        BancoController crud = new BancoController(getBaseContext());
        Cursor cursor = crud.carregaDados();

        String nomeCampo = (DbHelper.IG_NOME);
        texto_Banco.setText(nomeCampo);


         */

        //MES DE JANEIRO
        switch (NomeAlimento) {
            case "Abobrinha":
                //Definindo Array
                String[] valores = new String[]{
                        "Abobrinha Gratinada",
                        "Quibe de Aborinha na Travessa",
                        "Macarrão com Abobrinha com Manjericão",
                        "Abobrinha de Forno com Tomate",
                        "Rolinhos de Abobrinha (Wrap de Abobrinha)",
                        "Quibe de Abobrinha na Travessa",
                        "Lasanha de Abobrinha",
                        "Macarrão com Abobrinha",
                        "Mil folhas de Abobrinha",
                        "Abobrinha à Milanesa"


                };

                ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Alface":
                valores = new String[]{
                        "Trouxinha de Alface (Embrulhadinho Veloz)",
                        "Rolinho de Alface Fácil",
                        "Salada Leve",
                        "Salada caesar com alface romana e couve",
                        "Salada de alface americano e abacate",
                        "Panqueca de Alface",
                        "Salada Primavera",
                        "Salada Grega"
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Couve":
                valores = new String[]{
                        "Couve Refogada Piná",
                        "Purê de Couve",
                        "Caldo Verde Vegetariano",
                        "Suco de Couve com Limão"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Cupuaçu":
                valores = new String[]{
                        "Bolo de Cupuaçu",
                        "Geleia de Cupuaçu",
                        "Pavê de Cupuaçu",
                        "Pudim de Capuaçu"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Goiaba":
                valores = new String[]{
                        "Doce de Goiaba",
                        "Mousse de Goiaba",
                        "Compota de Goiaba",
                        "Cheesecake de Romeu e Julieta",
                        "Bolo de Fubá com Goiabada",
                        "Crumble de Goiaba",
                        "Flan de Goiaba",
                        "Goiabada",
                        "Bolo de Goiaba",
                        "Goiaba Assada com Mel",
                        ""



                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;


            case "Limão":
                valores = new String[]{
                        "Mousse Fácil de Limão",
                        "Brigadeiro Branco com Limão",
                        "Madeleines de Limão",
                        "Bolo de Sorvete de Limão",
                        "Lemon Curd - Creme de Limão",
                        "Torta de Limão - Chessecake de Limão",
                        "Pudim de Limão",
                        "Bolo de Limão",
                        "Cupcake de Limão",

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;


            case "Maracujá":
                valores = new String[]{
                        "Mousse de Maracujá",
                        "Tiramisu de Maracujá",
                        "Flan de Maracujá com Iogurte",
                        "Minis sonhos de Maracujá",
                        "Brigadeiro de Maracujá",
                        "Cocada de Maracujá",
                        "Pudim de Maracujá com cobertura de Iogurte"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;


            case "Tomate":
                valores = new String[]{
                        "Tomate Recheado",
                        "Bruschetta de Tomate",
                        "Tomate Seco Caseiro",
                        "Salada de Tomate Cereja com Queijo e Maçã",
                        "Risoto de Tomate Seco e Rúcula",
                        "Salada Carpaccio de Tomate",
                        "Pasta de Tomate",
                        "Salada de Tomate ao Curry",
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;


            case "Pimentão":
                valores = new String[]{
                        "Antepasto de Pimentão Assado",
                        "Geléia de Pimentão",
                        "Pimentão Recheador com Carne Móida",
                        "Molho de Pimentão Vermelho Assado",
                        "Chutney de Pimentão",

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;


                /////// Fim de Algumas Receitas de Janeiro, Caso repetidas será adicionada receitas acima
            case "Abacate":
                valores = new String[]{
                        "Bolo de Abacate",
                        "Sorvete de Abacate",
                        "Sopa de Abacate",
                        "Macarrão com molho de abacate",
                        "Chutney de Pimentão",

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Coco Verde":
                valores = new String[]{
                        "Pudim de Coco Verde",
                        "Queijo de Coco Verde (Para Sobremesas)",
                        "Farofa de Coco Verde",
                        "Camarão ao Coco Verde",
                        "Falsa Mousse de Coco Verde"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Maçã":
                valores = new String[]{
                    "Tortinha de Maçã",
                    "Crumble de Maçã",
                        "Donuts de Maçã",
                        "Salpicão de Frango",
                        "Cuca de Maçã"


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Pêra":
                valores = new String[]{
                       "Molho de Pêra",
                        "Pêra Caramelisada",
                        "Pêras ao Vinho Branco",
                        "Fritadinhas de Pêra com massa de Cerveja",
                        "Torta de Pêra"



                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Pêssego":
                valores = new String[]{
                        "Crocante de Pêssego",
                        "Gelado de Pêssego",
                        "Pavê de Pêssego",
                        "Gelia de Pêssego",
                        "Chá Texano de Pêssego"



                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Hortelã":
                valores = new String[]{
                       "Molho de Hortelã",
                        "Salada de Frutas com Creme de Hotelã",
                        "Pesto de Hotelã",
                        "Bolo de Hortlã",
                        "Creme de Hortlã"



                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Repolho":
                valores = new String[]{
                     "Farofa de Repolho",
                        "Torta de Repolho",
                        "Salada Coleslaw",
                        "Creme de Repolho",
                        "Repolho GRatinado"



                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Abóbora":
                valores = new String[]{
                        "Purê de Abóbora",
                        "Gratinado de abóbora de Frango",
                        "Risoto de Abóbora",
                        "Torta de Abóbora e Couve",
                        "Abóbora assada com shoyu e mel"
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Milho Verde":
                valores = new String[]{
                        "Viradinho de Milho Verde",
                        "Cural de Milho Verde",
                        "Brigadeiro de Milho Verde",
                        "Tortilha de Milho",
                        "Nhoque de Milho Verde"
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Abacaxi":
                valores = new String[]{
                        "Gelado de Abacaxi",
                        "Torta Gelada de Abacaxi e Coco",
                        "Abacaxi Assado",
                        "Frango com Abacaxi"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Alho Poró":
                valores = new String[]{
                        "Quiche de Alho Poró",
                        "Sopa de Alho Poró",
                        "Farofa de Alho Poró",
                        "Picadinhdo de Carne ao Alho Poró",
                        "Arroz com queijo e Alho Poró"


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;


            case "Ameixa":
                valores = new String[]{
                       "Bolo de Ameixa",
                        "Geléia de Ameixa",
                        "Torta de Ameixa",
                        "Rocambole de creme de limão e Ameixa",
                        "Picolé de iogurte e Ameixa"


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Berinjela":
                valores = new String[]{
                        "Berijela Recheada",
                        "Berinjela à Pamegiana",
                        "Antepasto de Berinjela",
                        "Escabiche de Berinjela",
                        "Strogonoff de Berinjela"
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Cará":
                valores = new String[]{
                        "Bolinho de Cará",
                        "Sopa de Cará",
                        "Escondidinho de Cará e carne moída",
                        "Pudim de Cará",
                        "Carne seca com Cará"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Endívias":
                valores = new String[]{
                       "Endívias Gratinadas",
                        "Salada de Endívias com cream chese",
                        "Endívia Recheada",
                        "Endívias ao Forno"


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Rúcula":
                valores = new String[]{
                        "Macarrão com pesto de Rúcula, hortelã e Gorgonzola",
                        "Crepioca de Frango e Rúcula",
                        "Salada defumada de Rúcula e Maçã",
                        "Tabule de Rúcula",
                        "Molho de Rúcula"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Tangerina":
                valores = new String[]{
                        "Bolo Cremoso de Tangerina",
                        "Cookie de casca de Tangerina",
                        "Pudim de Tangerina",
                        "Frango ao molho de Tangerina",
                        "Salada de Folhas verdes com Tangerina",
                        "Salmão ao molho de Tangerina",
                        "Casquinha Cristalizada de Mexerica",
                        "Bolo de Mexerica",
                        "Mousse de Tangerina",
                        "Bolo de Mexerica com Cachaça"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;


            case "Banana-Maçã":
                valores = new String[]{
                        "Muffin de Banana",
                        "Cookie de Banana e Aveia",
                        "Creme de Banana com Chocolate",
                        "Bolinho de chuva com Banana",
                        "Bolinho de Banana com Canela"


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Beterraba":
                valores = new String[]{
                        "Hummus de Beterraba",
                        "Pasta de Beterraba",
                        "Espagueti ao Molho de Beterraba",
                        "Beterraba em Conserva",
                        "Bolo de Beterraba"
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Chuchu":
                valores = new String[]{
                        "Chuchu Mexicano",
                        "Chuchu Recheado",
                        "Chuchu ao Alho e Óleo",
                        "Chuchu Assado",
                        "Suflê de Chuchu",
                        "Chuchu Gratinado",
                        "Purê Delicioso de Chuchu",


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Inhame":
                valores = new String[]{
                        "Purê de Inhame",
                        "Bolinho de Inhame",
                        "Inhame ao Murro",
                        "Dadinho de Inhame",
                        "Sopa de Inhame"
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Kiwi":
                valores = new String[]{
                        "Vinagrete de Kiwi",
                        "Delicia de Kiwi",
                        "Picolé de Kiwi Fit",
                        "Tortinha de Kiwi",
                        "Bolo de Kiwi"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Mamão":
                valores = new String[]{
                        "Doce de Mamão",
                        "Ceviche de Mamão",
                        "Chutney de Mamão",
                        "Sorvete de Mamão",
                        "Smoothie Caroteno"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Nabo":
                valores = new String[]{
                        "Creme de Nabo",
                        "Salada de Nabo",
                        "Nabo Crocante",
                        "Nabo Gratinado"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Uva":
                valores = new String[]{
                        "Escondidinho de Uva",
                        "Surpresa de Uva",
                        "Uvas no Mar Negro",
                        "Crème Brulée",
                        "Geleia de Uva"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Batata Doce":
                valores = new String[]{
                        "Purê de Batata Doce Amarela",
                        "Batata Doce Assada",
                        "Batata Doce Frita",
                        "Salada de Batata Doce Amarela com Bacalhau",
                        "Batata Doce Assada com Manjerona"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Mandioca":
                valores = new String[]{
                        "Palitos de Mandioca Assada",
                        "Bolinho de Mandioca",
                        "Mandioca com Bacon e Tomate",
                        "Bolo de Mandioca",
                        "Almondegas de Mandioca"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Espinafre":
                valores = new String[]{
                        "Espinafre Cremose",
                        "Gratinado de Espinafre",
                        "Torradinha com Creme de Espinafre e Ovo",
                        "Bolinho de Espinafre e aveia",
                        "Lasanha de Espinafre"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Morango":
                valores = new String[]{
                        "Bolo de Morango Low Carb",
                        "Pavê de Morangos",
                        "Bombom de Travessa de Morango",
                        "Cheesecake de Morango",
                        "Morango Frito no Palito"
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Ovos":
                valores = new String[]{
                        "Ovos Gratinados",
                        "Ovos no Purgatório",
                        "Arrumadinho de Vegetais com Ovos",
                        "Ovo Benedict",
                        "Ovo Mexido Cremoso"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Mandioquinha":
                valores = new String[]{
                        "Creme de Mandoquinha",
                        "Mandioquinha",
                        "Purê de Mandioquinha",
                        "Escondidinho de frango com purê de Mandioquinha",
                        "Sopa de Mandioquinha com Carne"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Abóbora Moranga":
                valores = new String[]{
                        "Frango cremoso na Moranga",
                        "Abóbora recheada com Ricota",
                        "Camarão na Moranga",
                        "Docinho de Abóbora Moranga",
                        "Costelinha de Porco com Moranga Caramelizada e abobrinha"


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Chicória":
                valores = new String[]{
                        "Salada de Chicória light com Damasco e nozes",
                        "Salada de Chicória light com Tomate",
                        "Salada de Chicória light com abobrinha",
                        "Salada de Chicória light com Frango",
                        "Torta Cremosa de Chicória"
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Canjica":
                valores = new String[]{
                        "Canjica Doce",
                        "Canjica Doce com leite condensado",
                        "Canjica Temperada com Limão e Lavanda",
                        "Sorvete de Canjica",
                        "Canjica Vegana"
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    }
                });
                break;

            case "Caqui":
                valores = new String[]{
                        "Geleia de Caqui",
                        "Doce de Caqui",
                        "Bolo de Caqui",
                        "Salada de Couve-flor, banana e caqui",
                        "Mufin de Cacqui",
                        ""


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;



















        }


    }
}

