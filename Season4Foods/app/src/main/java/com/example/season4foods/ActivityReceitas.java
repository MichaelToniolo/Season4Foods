package com.example.season4foods;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
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
    Button button;
    ImageView Imagem;


    @SuppressLint("SetTeast18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receitas);

        nome_alimento = findViewById(R.id.nome_alimento);
        lista_receitas = findViewById(R.id.lista_receitas);
        button = findViewById(R.id.btn_volte);
        Imagem = findViewById(R.id.Imagem);

        //Carregando dados da Intent Main
        final Bundle bundle = getIntent().getExtras();
        //assert bundle != null;

        //Caso o usuario use o botão de voltar do app ele vai verificar se uma variavel da outra tela existe
        //se ela existir vai ser armazenada na variavel "NomeAlimento" do contrário logicamente ele estará vindo da pagina main e então ele carrega normal a variavel que veio da main

        //se a variavel da tela preparo estiver preenchdia ele a variavel NomeAlimento receberá o valor

        //String receita = bundle.getString("receita");
        final String  NomeAlimento =bundle.getString("ingre");
        //if(receita !="") {
            //NomeAlimento = receita;
            //}else {

            //}

        nome_alimento.setText( NomeAlimento);
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
                Imagem.setImageResource(R.drawable.abobrinha);

                //Definindo Array
                String[] valores = new String[]{
                        "Abobrinha Gratinada",
                        "Quibe de Abobrinha na Travessa",
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

                Imagem.setImageResource(R.drawable.alface);
                valores = new String[]{
                        "Trouxinha de Alface (Embrulhadinho Veloz)",
                        "Rolinho de Alface Fácil",
                        "Salada Leve",
                        "Salada caesar com alface romana e couve",
                        "Salada de alface americano e abacate",
                        "Panqueca de Alface",
                        "Salada Primavera",
                        "Salada Grega",
                        "Salada Cassar",
                        "Salada de Alface com Laranja",
                        "Salada de Alface e Tomate com Pepino e Queijo",
                        "Salada de Alface com Frutas",
                        "Salada de Alface e Tomate com Molho Italiano",
                        "Salada de Alface com figo e Gorgonzola"

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
                Imagem.setImageResource(R.drawable.couve);
                valores = new String[]{
                        "Couve Refogada Piná",
                        "Purê de Couve",
                        "Creme de Folha de Couve",
                        "Caldo Verde Vegetariano",
                        "Suco de Couve com Limão",
                        "Cuscuz de Frango e Couve",
                        "Creme de Feijão com Couve e Alho-Poró",
                        "Gratinado de Couve Manteiga e Nozes",
                        "Quiche de Couve"

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
                Imagem.setImageResource(R.drawable.cupuacu);
                valores = new String[]{
                        "Mousse de Cupuaçu",
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
                Imagem.setImageResource(R.drawable.goiaba);
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
                        "Cheesecake de Goiaba",
                        "Smoothie de Goiaba",
                        "Tapioca de Romeu e Julieta",
                        "Geléia de Goiaba",
                        "Sorvete de Nata com Goiaba",
                        "Croissant Recheado de Goiaba"

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
                Imagem.setImageResource(R.drawable.limao);
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
                        "Creme de Limão"

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
                Imagem.setImageResource(R.drawable.maracuja);
                valores = new String[]{
                        "Mousse de Maracujá",
                        "Tiramisu de Maracujá",
                        "Flan de Maracujá com Iogurte",
                        "Minis sonhos de Maracujá",
                        "Brigadeiro de Maracujá",
                        "Cocada de Maracujá",
                        "Pudim de Maracujá com cobertura de Iogurte",
                        "Cheesecake de Maracujá",
                        "Panna Cotta de coco com maracujá",
                        "Milk-Shake de Maracujá",
                        "Geléia de Maracujá",
                        "Bolo Mousse de Maracujá",
                        "Bolo Vegano de Maracujá",
                        "Pavê de Maracujá e Chocolate",
                        "Torta de Manga com Maracujá"


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
                Imagem.setImageResource(R.drawable.tomate);
                valores = new String[]{
                        "Tomate Recheado",
                        "Bruschetta de Tomate",
                        "Tomate Seco Caseiro",
                        "Salada de Tomate Cereja com Queijo e Maçã",
                        "Risoto de Tomate Seco e Rúcula",
                        "Salada Carpaccio de Tomate",
                        "Pasta de Tomate",
                        //"Salada de Tomate ao Curry",
                        "Quiche de Tomate e Espinafre",
                        "Tomate Assado",
                        "Molho de Tomate",
                        "Sopa de Tomate",
                        "Sopa de Tomate ao Curry",
                        "Tomates Verdes Fritos",
                        "Tomate com Ovo",
                        "Patê de Ricota com Tomate Seco"

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
                Imagem.setImageResource(R.drawable.pimentao);
                valores = new String[]{
                        "Molho Completo De Pimentão",
                        "Geléia de Pimentão",
                        "Pimentão Recheado com Carne Móida",
                        "Molho de Pimentão Vermelho Assado",
                        "Chutney de Pimentão",
                        "Arroz com Pimentão",
                        "Carne Louca de Festa"


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
                Imagem.setImageResource(R.drawable.abacate);
                valores = new String[]{
                        "Bolo de Abacate",
                        "Sorvete de Abacate",
                        "Sopa de Abacate e Tomate",
                        "Macarrão com molho de abacate",
                        "Vitamina de Abacate",
                        "Guacamole",
                        "Salada de Abacate",
                        "Nhoque de Abacate"

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
                Imagem.setImageResource(R.drawable.cocoverde);
                valores = new String[]{
                        "Pudim de Coco Verde",
                        "Queijo de Coco Verde",
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
                Imagem.setImageResource(R.drawable.maca);
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
                Imagem.setImageResource(R.drawable.pera);
                valores = new String[]{
                        "Molho de Pêra",
                        "Pêra Caramelizada",
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
                Imagem.setImageResource(R.drawable.pessego);
                valores = new String[]{
                        "Crocante de Pêssego",
                        "Gelado de Pêssego",
                        "Pavê de Pêssego",
                        "Geléia de Pêssego",
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
                Imagem.setImageResource(R.drawable.hortela);
                valores = new String[]{
                       "Molho de Hortelã",
                        "Salada de Frutas com Creme de Hotelã",
                        "Pesto de Hortelã",
                        "Bolo de Hortelã",
                        "Creme de Hortelã"



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
                Imagem.setImageResource(R.drawable.repolho);
                valores = new String[]{
                     "Farofa de Repolho",
                        "Torta de Repolho",
                        "Salada Coleslaw",
                        "Creme de Repolho",
                        "Repolho Gratinado"



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
                Imagem.setImageResource(R.drawable.abobora);
                valores = new String[]{
                        "Purê de Abóbora",
                        "Gratinado de abóbora de Frango",
                        "Risoto de Abóbora",
                        "Torta de Abóbora e Couve",
                        "Abóbora assada com shoyu e mel",
                        "Sopa de Abóbora com Grão de Bico e Costela",
                        "Creme de Abóbora com Bacon",
                        "Doce de Abóbora com Coco Ralado",
                        "Risoto de Abóbora com Carne-Seca",
                        "Croquete de Abóbora com Carne-Seca"
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
                Imagem.setImageResource(R.drawable.milhoverde);
                valores = new String[]{
                        "Viradinho de Milho Verde",
                        "Cural de Milho Verde",
                        "Brigadeiro de Milho Verde",
                        "Tortilha de Milho",
                        "Nhoque de Milho Verde",
                        "Bolo de Milho",
                        //"Canjica",
                        "Pamonha Assada",
                        "Creme de Milho",

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

                Imagem.setImageResource(R.drawable.abacaxi);
                valores = new String[]{
                        "Gelado de Abacaxi",
                        "Torta Gelada de Abacaxi e Coco",
                        "Abacaxi Assado",
                        "Frango com Abacaxi",
                        "Bolo de Abacaxi",
                        "Mousse de Abacaxi",
                        "Abacaxi com Calda de Maracujá",
                        "Taça de Abacaxi"

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
                Imagem.setImageResource(R.drawable.alhoporo);
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
                Imagem.setImageResource(R.drawable.ameixa);
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
                Imagem.setImageResource(R.drawable.berinjela);
                valores = new String[]{
                        "Berinjela Recheada",
                        "Berinjela à Parmegiana",
                        "Antepasto de Berinjela",
                        "Escabeche de Berinjela",
                        "Strogonoff de Berinjela",
                        "Berinjela à Milanesa",
                        "Bolinho de Berinjela",
                        "Entrada Frio de Berinjela Japonesa",
                        "Salada de Berinjela Grelhada e Queijo de Cabra",
                        "Berinjela com Missô",
                        "Mabonasu (Berinjela Apimentada)"
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Berinjela Japonesa":
                Imagem.setImageResource(R.drawable.berinjelajaponesa);
                valores = new String[]{
                        "Entrada Frio de Berinjela Japonesa",
                        "Salada de Berinjela Grelhada e Queijo de Cabra",
                        "Berinjela com Missô",
                        "Mabonasu (Berinjela Apimentada)"
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
                Imagem.setImageResource(R.drawable.cara);
                valores = new String[]{
                        "Bolinho de Cará",
                        "Sopa de Cará",
                        "Escondidinho de Cará e carne moída",
                        "Pudim de Cará",
                        "Carne seca com Cará",
                        "Purê de Cará com Bacon",
                        "Cará Assado",
                        "Coxinha de Cará",
                        "Chips de Cará"

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
                Imagem.setImageResource(R.drawable.endivias);
                valores = new String[]{
                       "Endívias Gratinadas",
                        "Salada de Endívias com cream cheese",
                        "Endívia Recheada"

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
                Imagem.setImageResource(R.drawable.rucula);
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
                Imagem.setImageResource(R.drawable.tangerina);
                valores = new String[]{
                        "Bolo Cremoso de Tangerina",
                        "Cookie de casca de Tangerina",
                        "Pudim de Tangerina",
                        "Frango ao molho de Tangerina",
                        "Salada de Folhas verdes com Tangerina",
                        "Salmão ao molho de Tangerina",
                        "Bolo de Mexerica",
                        "Mousse de Tangerina",
                        "Bolo de Mexerica com Cachaça",
                        "Geleia de Tangerina",


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
                Imagem.setImageResource(R.drawable.bananamaca);
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
                Imagem.setImageResource(R.drawable.beterraba);
                valores = new String[]{
                        "Hummus de Beterraba",
                        "Pasta de Beterraba",
                        "Espagueti ao Molho de Beterraba",
                        "Beterraba em Conserva",
                        "Bolo de Beterraba",
                        "Beterraba Assada",
                        "Carutinhos de Folhas de Beterraba",
                        "Sopa de Beterraba",
                        "Refresco de Laranja e Beterraba",
                        "Panqueca de Beterraba e Frango",
                        "Carpaccio de Beterraba",
                        "Pão de Beterraba",
                        "Sopa Russa de Beterraba"
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
                Imagem.setImageResource(R.drawable.chuchu);
                valores = new String[]{
                        "Chuchu Mexicano",
                        "Chuchu Recheado",
                        "Chuchu ao Alho e Óleo",
                        "Chuchu Assado",
                        "Suflê de Chuchu",
                        "Chuchu Gratinado",
                        "Purê Delicioso de Chuchu",
                        "Chuchu Crocante",
                        "Chuchu Refogado",
                        "Omelete de Chuchu light",
                        "Sopa de Chuchu",
                        "Talharim de Chuchu",
                        "Bolinho de Chuchu",
                        "Chuchu à Milanesa"


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
                Imagem.setImageResource(R.drawable.inhame);
                valores = new String[]{
                        "Purê de Inhame",
                        "Bolinho de Inhame",
                        "Inhame ao Murro",
                       // "Dadinho de Inhame",
                        "Sopa de Inhame",
                        "Panqueca de Inhame",
                        "Brigadeiro de Inhame",
                        "Creme de Inhame",
                        "Nhoque de forno de batata-doce e inhame com pesto",
                        "Pão de Queijo de Inhame"


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
                Imagem.setImageResource(R.drawable.kiwi);
                valores = new String[]{
                        "Vinagrete de Kiwi",
                        "Delícia de Kiwi",
                        "Picolé de Kiwi Fit",
                        "Tortinha de Kiwi",
                        "Bolo de Kiwi",
                        "Geléia de Kiwi",
                        "Panqueca com calda de Kiwi",
                        "Suco de Uva, Kiwi e Laranja",
                        "Picolé de Kiwi"


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
                Imagem.setImageResource(R.drawable.mamao);
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
                Imagem.setImageResource(R.drawable.nabo);
                valores = new String[]{
                        "Creme de Nabo",
                        "Salada de Nabo",
                        "Nabo Crocante",
                        "Nabo Gratinado",
                        "Salada com nabo light",
                        "Nabo gratinado light",
                        "Frango ao curry com nabo light",
                        "Sopa de nabo light",
                        "Wrap com Nabo light"

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
                Imagem.setImageResource(R.drawable.uva);
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
                Imagem.setImageResource(R.drawable.batatadoce);
                valores = new String[]{

                        "Batata Doce Assada",
                        "Batata Doce Frita",
                        "Salada de Batata Doce Amarela com Bacalhau",
                        "Batata Doce Assada com Manjerona",
                        "Nhoque de Batata Doce",
                        "Escondidinho de Batata Doce",
                        "Batata Doce Rústica com Salmão Grelhado",
                        "Batata Doce Assada na páprica com frango assado",
                        "Batata Doce Recheada",
                        "Escondidinho de Frango com Batata Doce"

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
                Imagem.setImageResource(R.drawable.mandioca);
                valores = new String[]{
                        "Palitos de Mandioca Assada",
                        "Bolinho de Mandioca",
                        "Mandioca com Bacon e Tomate",
                        "Bolo de Mandioca",
                        "Almondegas de Mandioca",
                        "Quindim de mandioca",
                        "Vaca Atolada",
                        "Bolo de Mandioca",
                        "Pudim de Mandioca e Coco",
                        "Creme de Mandioca",
                        "Mandioca Crocante com Molho Apimentado",
                        "Gratinado de Mandioca com Carne Moída"

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
                Imagem.setImageResource(R.drawable.espinafre);
                valores = new String[]{
                        "Espinafre Cremoso",
                        "Gratinado de Espinafre",
                        "Torradinha com Creme de Espinafre e Ovo",
                        "Bolinho de Espinafre e aveia",
                        "Lasanha de Espinafre",
                        "Pão de Espinafre",
                        "Canelone de Espinafre e Gorgonzola",
                        "Nhoque de batata com creme de espinafre",
                        "Bife a Rolê com liguiça defumada e espinafre"


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
                Imagem.setImageResource(R.drawable.morango);
                valores = new String[]{
                        "Bolo de Morango Low Carb",
                        "Pavê de Morangos",
                        "Bombom de Travessa de Morango",
                        "Cheesecake de Morango",
                        "Morango Frito no Palito",
                        "Torta de Morango e Chocolate",
                        "Bolo Mousse de Morango Base Pão de Ló",
                        "Ovo de Páscoa de Morango, Leite Ninho e Nutella",
                        "Salada de Morango",
                        "Wrap de Rúcula e Morango"

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
                Imagem.setImageResource(R.drawable.ovos);
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
                Imagem.setImageResource(R.drawable.mandioquinha);
                valores = new String[]{
                        "Creme de Mandioquinha",
                        "Mandioquinha",
                        "Purê de Mandioquinha",
                        "Escondidinho de Frango com Purê de Mandioquinha",
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
                Imagem.setImageResource(R.drawable.aboboramoranga);
                valores = new String[]{
                        "Frango Cremoso na Moranga",
                        "Abóbora recheada com Ricota",
                        "Camarão na Moranga",
                        "Docinho de Abóbora Moranga",
                        "Costelinha de Porco com Moranga Caramelizada e Abobrinha",
                        "Doce de Abóbora com Coco Ralado"


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
                Imagem.setImageResource(R.drawable.chicoria);
                valores = new String[]{
                        "Salada de Chicória light com Damasco e nozes",
                        "Salada de Chicória light com Tomate",
                        "Salada de Chicória Light com Abobrinha",
                        "Salada de Chicória Light com Frango",
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
                Imagem.setImageResource(R.drawable.canjica);
                valores = new String[]{
                        "Canjica Doce",
                        "Canjica Doce com Leite Condensado",
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
                Imagem.setImageResource(R.drawable.caqui);
                valores = new String[]{
                        "Geleia de Caqui",
                        "Doce de Caqui",
                        "Bolo De Caqui",
                        "Salada de Couve-flor, banana e caqui",
                        "Muffin de Caqui"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Pinhão":
                Imagem.setImageResource(R.drawable.pinhao);
                valores = new String[]{
                        "Badejo em Crosta de Pinhão",
                        "Brownie de Pinho",
                        "Nhoque de Pinhão",
                        "Molho ao sugo com mini almôndegas de Pinhão",
                        "Tapas de Pinhão e Palmito pupunha"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Pepino Japonês":
                Imagem.setImageResource(R.drawable.pepinojapones);
                valores = new String[]{
                        "Salada de Pepino Japones Simples",
                        "Pepino Japones em Salmora",
                        "Salada de Pepino com Molho Agridoce",
                        "Salada Thai de Pepino"


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Pepino":
                Imagem.setImageResource(R.drawable.pepino);
                valores = new String[]{
                        "Tzatziki",
                        "Vinagrete de Pepino",
                        "Gaspacho de Pepino",
                        "Suco de Maçã com Pepino",
                        "Sunomono",
                        "Salada de Pepino Japones Simples",
                        "Pepino Japones em Salmora",
                        "Salada de Pepino com Molho Agridoce",
                        "Salada Thai de Pepino"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;


            case "Rabanete":
                Imagem.setImageResource(R.drawable.rabanete);
                valores = new String[]{
                        "Smoothie de Rabanete e Morango",
                        "Sopa de Rabanete",
                        "Saladinha de Rabanete",
                        "Suco de Laranja, Cenoura e Rabanetes",
                        "Sanduíche de Rabanete",
                        "Risoto de Rabanete"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Cenoura":
                Imagem.setImageResource(R.drawable.cenoura);
                valores = new String[]{
                        "Suco de Cenoura e Maçã",
                        "Bolinho de Cenoura",
                        "Souflê de Cenoura",
                        "Creme de Cenoura",
                        "Cookie de Cenoura",
                        "Bolo de Cenoura",
                        "Refogado de Cenoura com Chuchu",
                        "Bolinho de Chuva de Cenoura com Chocolate",
                        "Cupcake de Cenoura e Brigadeiro",
                        "Hambúrguer de Cenoura",
                        "Cenoura Crocante",
                        "Cenouras Salteadas com Mel",
                        "Cenouras Assadas em Palito com Alecrim",
                        "Salada de Repolho Roxo, Cenoura, Couve e Hortelã",
                        "Risoto de Cenoura"



                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Banana":
                Imagem.setImageResource(R.drawable.banana);
                valores = new String[]{
                        "Canapé de Banana com Parmesão",
                        "Bolo de Banana",
                        "Banana-Passa Recheada de Doce de Leite",
                        "Torta de Banana e Suspiro",
                        "Torta de Banana e Goiaba"


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Escarola":
                Imagem.setImageResource(R.drawable.escarola);
                valores = new String[]{
                        "Panqueca Integral de Ricota, Alho-poró, Tomate e Escarola",
                        "Sopa de Escarola com Arroz",
                        "Torta di Scarola e Olive",
                        "Capellini com Escarola e Queijo"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Alho":
                Imagem.setImageResource(R.drawable.alho);
                valores = new String[]{
                        "Pasta de Alho Assado",
                        "Pasta de Alho com Maionese para Pão",
                        "Creme de Alho",
                        "Pão de Alho para Churrasco com Pão Frances Amanhecido"
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;


            case "Caju":
                Imagem.setImageResource(R.drawable.caju);
            valores = new String[]{
                    "Doce de Caju",
                    "Caipirosca de Caju",
                    "Suco de Caju Picante",
                    "Bolo de Caju",
                    "Caju em Calda"
            };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Jabuticaba":
                Imagem.setImageResource(R.drawable.jabuticaba);
                valores = new String[]{
                        "Pudim de Ricota com Jabuticaba",
                        "Suflê Gelado de Jabuticaba",
                        "Filé de Frango ao Molho de Jabuticaba",
                        "Torta com Geléia de Jabuticaba",
                        "Crostata com Geleia de Jabuticaba"
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;
            case "Mamão Havaí":
                Imagem.setImageResource(R.drawable.mamaohavai);
                valores = new String[]{
                        "Frango ao Molho de Mamão Havaí",
                        "Salada de Mamão com Aveia",
                        "Carne Seca com Mamão",
                        "Doce de Mamão na Panela de Pressão",
                        "Picadinho de Mamão"
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Agrião":
                Imagem.setImageResource(R.drawable.agriao);

                valores = new String[]{
                        "Rabada com Agrião",
                        "Creme de Agrião",
                        "Sopa de Agrião com Azeite e Tomate Seco",
                        "Vinagrete com Agrião",
                        "Carne de Panela com Agrião"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Almeirão":
                Imagem.setImageResource(R.drawable.almeirao);
                valores = new String[]{
                        "Salada de Almeirão",
                        "Salada de Almeirão com Alcaparras",
                        "Refogado de Almeirão com Feijão",
                        "Carne Assada com Almeirão",
                        "Salada de Almeirão com Bacon"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Palmito":
                Imagem.setImageResource(R.drawable.palmito);
                valores = new String[]{
                        "Creme de Palmito",
                        "Pastel de Palmito Cremoso",
                        "Quiche de Palmito e Alho Poró",
                        "Empadão de Palmito",
                        "Lasanha de Palmito",
                        "Palmito Gratinado",
                        "Lasanha de Palmito Gratinada",
                        "Arroz com Creme de Palmito",
                        "Refogado de Palmito"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Banana Prata":
                Imagem.setImageResource(R.drawable.bananaprata);
                valores = new String[]{
                       "Cupcake de Banana Prata com Canela",
                        "Cartola de Banana Prata e Queijo",
                        "Brioche de Banana Prata",
                        "Torta de Banana Prata Crocante",
                        "Bolinho de Banana Prata Frito"


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Manga":
                Imagem.setImageResource(R.drawable.manga);
                valores = new String[]{
                        "Mousse de Manga",
                        "Bavaroise de Manga",
                        "Doce de Manga",
                        "Pavê de Manga",
                        "Juju de Manga"


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Brócolis":
                Imagem.setImageResource(R.drawable.brocolis);
                valores = new String[]{
                        "Penne ao Molho de Queijo e Brócolis",
                        "Macarrão com Brócolis e Bacon",
                        "Souflé de Brócolis",
                        "Creme de Brócolis",
                        "Lasanha de Brócolis"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Acerola":
                Imagem.setImageResource(R.drawable.acerola);
                valores = new String[]{
                        "Geleia de Acerola",
                        "Licor de Acerola",
                        "Mousse de Acerola",
                        "Pudim de Acerola",
                        "Torta de Acerola"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Nozes":
                Imagem.setImageResource(R.drawable.nozes);
                valores = new String[]{
                        "Brownie de Nozes",
                        "Strogonoff de Nozes",
                        "Pavê de Nozes",
                        "Camafeu de Nozes",
                        "Baklavá de Nozes"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;


            case "Alcachofras":
                Imagem.setImageResource(R.drawable.alcachofra);
                valores = new String[]{
                        "Alcachofra com Molho de Ervas",
                        "Homus de Alcachofra",
                        "Tapenade de Alcachofra",
                        "Alcachofra Assada com Limão e Água",
                        "Alcachofra com Tofu"


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;


            case "Couve-Flor":
                Imagem.setImageResource(R.drawable.couveflor);
                valores = new String[]{
                        "Omelete de Forno com Couve-Flor",
                        "Couve-Flor Recheada de Microondas",
                        "Couve-Flor ao Forno com Creme de Milho",
                        "Bolinho de Couve-Flor",
                        "Sopa de Couve-Flor"
                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;


            case "Abacaxi Pérola":
                Imagem.setImageResource(R.drawable.abacaxiperola);
                valores = new String[]{
                        "Doce de Abacaxi Pérola",
                        "Torta de Abacaxi",
                        "Bolo de Abacaxi",
                        "Milk-Shake de Abacaxi e Coco",
                        "Arroz Frito com Abacaxi"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Amêndoas":
                Imagem.setImageResource(R.drawable.amendoas);
                valores = new String[]{
                        "Amêndoas Caramelizadas",
                        "Salgadinhos de Amêndoas",
                        "Cupcake Integral de Amêndoas",
                        "Cookies de Chocolate Branco e Amêndoas",
                        "Muffins de Amêndoas com Tangerina",
                        "Frango ao Mel, Amêndas e Especiarias",
                        "Pudim de Amêndoas",
                        "Amêndoas Caramelizadas",
                        "Brócolis com Lascas de Amêndoas",
                        "Arroz com Amêndoas",


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Amora":
                Imagem.setImageResource(R.drawable.amora);
                valores = new String[]{
                        "Geleia de Morango",
                        "Mousse de Amora",
                        "Flan de Amora com Leite Condensado",
                        "Sorvete de Amora",
                        "Torta de Amora"


                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;


            case "Castanha Nacional":
                Imagem.setImageResource(R.drawable.castanhanacional);
                valores = new String[]{
                        "Mousse de Cupuaçu com Castanha",
                        "Farofa de Castanha",
                        "Torta de Chocolate com Castanha",
                        "Bolo de Banana com Castanha",
                        "Torta de Maçã Caramelizada com Castanha"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Jaca":
                Imagem.setImageResource(R.drawable.jaca);
                valores = new String[]{
                        "Doce de Jaca em Calda",
                        "Fricasse de Jaca",
                        "Carne de Jaca com Creme de Milho",
                        "Curry de Jaca Verde",
                        "Antepasto de Carne de Jaca"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Melão":
                Imagem.setImageResource(R.drawable.melao);
                valores = new String[]{
                        "Suchá de Melão com Mel",
                        "Sopa de Melão",
                        "Sorvete de Melão",
                        "Petisco de Presunto e Melão",
                        "Salada de Macarrão, Melão e Presunto Cru"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Maxixe":
                Imagem.setImageResource(R.drawable.maxixe);
                valores = new String[]{
                        "Ensopadinho de Maxixe",
                        "Maxixe com Coco",
                        "Maxixe com Carne de Sol",
                        "Maxixada Nordestina",
                        "Cabrito com Maxixe"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Laranja":
                Imagem.setImageResource(R.drawable.laranja);
            valores = new String[]{
                    "Doce de Laranja",
                    "Bolo Vulcão de Laranja",
                    "Laranja em Calda",
                    "Mix de Laranja",
                    "Salmão ao Molho Laranja",
                    "Geleia de Laranja"

            };

            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
            lista_receitas.setAdapter(adapter);

            lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                }
            });
            break;


            case "Quiabo":
                Imagem.setImageResource(R.drawable.quiabo);
                valores = new String[]{
                        "Quiabo sem Baba com Molho Delicioso",
                        "Quiabo com Linguinça",
                        "Arroz 7 Grãos com Quiabo e Frango Desfiado",
                        "Salada de Quiabo",
                        "Quiabo e Grão de Bico Assados",
                        "Farofa de Quiabo",
                        "Salada de Quiabo com Ricota"

                };

                adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores);
                lista_receitas.setAdapter(adapter);

                lista_receitas.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
                break;

            case "Batata Doce Amarela":
                Imagem.setImageResource(R.drawable.batatadoceamarela);
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

        }
        AdapterView listView;

        lista_receitas.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String  NomeAlimento =bundle.getString("ingre");

                int itemPosicao = position;
                lista_receitas.getItemAtPosition(position);
                String receitavalor = (String)
                        lista_receitas.getItemAtPosition(position);

                //Toast.makeText(getApplicationContext(), itemValor,Toast.LENGTH_LONG).show();
                Intent it = new Intent(ActivityReceitas.this, ActivityPreparo.class);
                it.putExtra("posit", position);
                it.putExtra("Receita",receitavalor);

                //esse putExtra ingrediente vai ser usado no botão voltar da proxima tela, para que ele saiba para qual receita listar, do contrario ele vai dar erro ao voltar
                //ele só vai carregar esssa variavel lá quando ele clicar no botão voltar da tela "preparo"
                it.putExtra("ingrediente",NomeAlimento);
                startActivity(it);

            }
        });

        button .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ActivityReceitas.this, MainActivity.class);
                startActivity(it);
            }
        });

    }
}