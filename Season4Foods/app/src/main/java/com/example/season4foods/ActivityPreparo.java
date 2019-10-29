package com.example.season4foods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityPreparo extends AppCompatActivity {

    TextView Preparo;
    TextView Ingredientes;
    ImageView Foto_alimento;
    LinearLayout GeralLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparo);

        Ingredientes = (TextView) findViewById(R.id.Ingredientes);
        Preparo = (TextView) findViewById(R.id.Preparo);
        Foto_alimento = (ImageView) findViewById(R.id.Foto_alimento);


        Bundle bundle = getIntent().getExtras();
        //assert bundle != null;
        String NomeAlimento = bundle.getString("Receita");
        Ingredientes.setText(NomeAlimento);


        //Carrega Receitas

        switch (NomeAlimento) {
            case "Vazio":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Mousse de Cupuaçu":
                Ingredientes.setText("- 200g de polpa de fruta (cupuaçu)\n- 1lata de leite condensado\n- 1 lata de creme de leite\n- ½ pacote de gelatina sem sabor dissolvido em água quente\n- folhas de hortelã e raspas de castanha para ornamentação do prato");
                Preparo.setText("Bater todos os ingredientes no liquidificadorColocar em taças para gelar ");
                break;

            case "Bolo de Cupuaçu":
                Ingredientes.setText("- Massa:\n- 1 e 1/2 xícara (chá) de polpa de cupuaçu\n- 1/2 xícara (chá) de leite\n- 4 ovos\n- 1/3 de xícara (chá) de óleo\n- 2 xícaras (chá) de açúcar\n- 2 e 1/2 xícaras (chá) de farinha de trigo\n- 1 colher (sopa) de fermento em pó\n- Manteiga ou óleo para untar\n- Farinha de trigo para polvilhar\n- Calda:\n- 1 xícara (chá) de polpa de cupuaçu\n- 1/2 xícara (chá) de açúcar ");
                Preparo.setText("Aqueça o forno a 180°C (médio-alto), unte muito bem com manteiga e polvilhe com farinha uma fôrma média de buraco no meio (o bolo gruda um pouco). Bata no liquidificador a polpa de cupuaçu, o leite, os ovos, o óleo e o açúcar até obter um creme liso. Passe para uma tigela, junte a farinha de trigo e o fermento e misture até obter uma massa homogênea. Despeje a massa na fôrma e asse por uns 40 minutos, até o bolo crescer, firmar e dourar (ao enfiar um palito no centro, ele deverá sair limpo). Retire do forno e deixe amornar por uns 10 minutos e desenforme. Prepare a calda enquanto o bolo assa. Coloque a polpa de cupuaçu e o açúcar numa panelinha e aqueça. Mexa até dissolver, depois pare de mexer direto, passando a mexer de 1 em 1 minuto, cozinhe por uns 15 minutos, até conseguir uma geleia dourada. Espalhe a geleia sobre o bolo e sirva. ");
                break;

            case "Geleia de Cupuaçu":
                Ingredientes.setText("- 120g de cupuaçu fresco ou polpa\n- 390g de leite condensado\n- 2 gemas\n- 200g de bolacha de aveia\n- 240 ml de leite\n- 60g de chocolate em pó\n- 12g de amido de milho ( 2 colheres de sopa)\n- 2 claras\n- ¼ de fava de baunilha\n- 20 ml de creme de leite de caixinha");
                Preparo.setText("Em uma panela bater as gemas, adicionar o leite condensado e em fogo baixo, mexer até ferver, quando ferver adicionar a polpa de cupuaçu e continuar mexendo, quando começar a desgrudar a da panela esta bom, dispor em taças ou em um refratário. Quebrar as bolachas de aveia e colocar metade em cima do creme amarelo. Dissolver o amido de milho no leite, levar para ferver na mesma panela, adicionar o chocolate em pó, e mexer até engrossar, dispor por cima das bolachas. Bater as claras em neve, adicionar a fava de baunilha e delicadamente incorporar o creme de leite sem soro de preferência gelado, dispor por cima das bolachas. Levar para a geladeira por 4 horas.");
                break;

            case "Pavê de Cupuaçu":
                Ingredientes.setText("- 120g de cupuaçu fresco ou polpa\n- 390g de leite condensado\n- 2 gemas\n- 200g de bolacha de aveia\n- 240 ml de leite\n- 60g de chocolate em pó\n- 12g de amido de milho ( 2 colheres de sopa)\n- 2 claras\n- ¼ de fava de baunilha\n- 20 ml de creme de leite de caixinha ");
                Preparo.setText("Descasque o cupuaçu, abra ao meio e retire as sementes da polpa, desprezando-as. Bata a polpa no liquidificador. Transfira para uma panela com o açúcar. Leve ao fogo baixo, mexendo, até ficar brilhante e começar a soltar do fundo do utensílio (esse é o ponto ideal da geleia).\n");
                break;

            case "Pudim de Capuaçu":
                Ingredientes.setText("- 1 kg de goiaba madura\n- 500 g de açúcar\n- 1/2 ml de água\n- Canela em pau a gosto ");
                Preparo.setText("Em uma panela bater as gemas, adicionar o leite condensado e em fogo baixo, mexer até ferver, quando ferver adicionar a polpa de cupuaçu e continuar mexendo, quando começar a desgrudar a da panela esta bom, dispor em taças ou em um refratário. Quebrar as bolachas de aveia e colocar metade em cima do creme amarelo. Dissolver o amido de milho no leite, levar para ferver na mesma panela, adicionar o chocolate em pó, e mexer até engrossar, dispor por cima das bolachas. Bater as claras em neve, adicionar a fava de baunilha e delicadamente incorporar o creme de leite sem soro de preferência gelado, dispor por cima das bolachas. Levar para a geladeira por 4 horas. ");
                break;

            case "Doce De Goiaba":
                Ingredientes.setText("- 1 kg de goiaba madura\n- 500 g de açúcar\n- 1/2 lde água\n- Canela em pau a gosto");
                Preparo.setText("Lave e descasque a goiaba. Corte - as ao meio e retire as sementes. Em uma panela grande, dissolva o açúcar na água. Junte a canela e leve ao fogo. Deixe a calda engrossar ligeiramente. Junte as goiabas e cozinhe por 15 minutos, cuidando para que a fruta não desmanche. Retire do fogo e dixe esfriar.");
                break;

            case "Mousse de Goiaba":
                Ingredientes.setText("- Ingredientes - Mousse:\n- 6 goiabas sem casca e sem sementes\n- 1 lata de leite condensado\n- 1 lata de creme de leite\n- 12g de gelatina em pó sem sabor = metade do pacote\n- 1 clara em neve bem firme\n- Ingredientes - Calda:\n- 2 goiabas sem casca e sem sementes picadas\n- 4 colheres de açúcar\n- 1 xicara de água\n- 1 colher de maisena");
                Preparo.setText("Modo de Preparo - Mousse: Bata no liquidificador as goiabas, o leite condensado e o creme de leite até que fique uma creme bem homogêneo. Hidrate a gelatina em3 colheres de água por 5 min. depois dissolva em banho maria, não deixe ferver. Acrescente a gelatina já dissolvida ao creme no liquidificador e bata apenas para misturar. Coloque o creme em um refratário e misture a clara em neve. Leve a geladeira para firmar. Modo de Preparo - Calda: Em uma panela coloque as goiabas picadas com o açucar e leve ao fogo até virar caramelo (amasse alguns pedaços da goiaba para que fique o gosto na calda). Dissolva a maisena na água e acrescente ao caramelo mexendo sempre até que fique mais grosso. Deixe cozinhar por uns 2 min. Desligue o fogo e espere ficar morno.");
                break;

            case "Compota De Goiaba":
                Ingredientes.setText("- 1 kg de goiaba\n- 1/2 kg de açúcar\n- 4 pedaços de canela em pau\n- 2 xícaras (chá) de Água");
                Preparo.setText("Lave bem as goiabas e depois remova as cascas. Corte-as ao meio e retire as sementes. Reserve. Ponha em uma panela o açúcar, os paus de canela e a água. Leve ao fogo médio e mexa com uma colher de pau até o açúcar se dissolver. Pare de mexer e deixe ferver por 15 minutos ou até formar uma calda rala. Junte as goiabas e abaixe o fogo. Cozinhe até ficarem macias, mas sem desmanchar. Retire do fogo e deixe esfriar. Transfira para uma compoteira ou guarde em potes de vidro.");
                break;


            case "Cheesecake de Romeu e Julieta":
                Ingredientes.setText("- Biscuit madeleine: \n- 60g de acucar\n- 1 ovo\n- raspa de 1 limao\n- 13g de leite\n- 63g de farinha de trigo\n- 2g de fermento quimico\n- 3g de suco de limao\n- 25g de manteiga derretida\n- 25g de mel\n- Geleia de goiaba: \n- 150g de goiabada\n- 100 ml de agua\n- 3g de gelatina incolor sem sabor\n- Creme de queijo: \n- 70g de leite\n- 160g de cream cheese\n- 200g de creme de leite batido em ponto de chantilly\n- 2 gemas\n- 55g de acucar\n- 4g de gelatina incolor sem sabor\n- Goiabada: \n- 1 goiaba cortada em fatias finas\n- 250 ml de agua \n- 150g de acucar");
                Preparo.setText("biscuit: Bata o acucar com o ovo e a raspa de limao. Incorpore aos poucos, alternando, o leite, o mel, o suco de limao e a manteiga derretida. Por ultimo ponha a farinha de trigo e o fermento quimico. Despeje tudo em uma forma de 20 cm de diametro untada e asse a 170 C por 15 minutos. Reserve. Geleia: Leve a goiabada e a agua ao fogo ate dissolver. Incorpore a gelatina hidratada. Creme de queijo: Aqueca o leite, derreta a gelatina hidratada no leite quente emisture no cream cheese. Faca uma calda com o acucar e umpouco de agua a 120ºC e incorpore na gema, batendo sempre. Misture as gemas no cream cheese e o creme de leite batido. Goiaba semiconfit: Ferva a agua com o acucar, desligue o fogo e despeje essa calda na goiaba fatiada e reserve por 24 horas. Montagem: Corte o biscuitem dois no sentido horizontal. Em um aro de 20 cm de diametro coloque uma fatia de biscuit, depois a geleia de goiaba, mais uma fatia de biscuit e o creme de queijo, leve a geladeira ou freezer ate que fique consistente. 3Desenforme e decore com as fatias de goiaba semiconfit.");
                break;

            case "Bolo de Fubá com Goiabada":
                Ingredientes.setText("- 2 xícaras de fubá\n- 2 xícaras de leite\n- 2 xícaras de açúcar\n- 1/3 de xícara de óleo vegetal\n- 50g de manteiga\n- 1 colher (chá) de sal\n- 4 ovos, gemas e claras separadas\n- 1 colher (sopa) de fermento em pó\n- 1 e ½ xícara de cubinhos de 1 cm de goiabada\n- manteiga para untar\n- fubá para polvilhar");
                Preparo.setText("Aqueça o fubá, o leite, o açúcar, o óleo, a manteiga e o sal numa panela média e, sempre mexendo, deixe no fogo por uns 10 minutos, até a massa ferver e engrossar e o fundo da panela aparecer. Deixe amornar por uns 15 minutos. Aqueça o forno a 200°C (médio-alto). Unte com manteiga e polvilhe com fubá uma fôrma para pudim ou uma assadeira grande. Bata as claras em neve até conseguir picos firmes. Junte as gemas, o fermento e os cubinhos de goiabada à massa e, em seguida, com uma espátula e muita delicadeza, incorpore às claras. Despeje a massa na fôrma e asse o bolo por uns 40 minutos, até que esteja crescido, bem dourado e firme (ao enfiar um palito no centro, ele deverá sair limpo). Deixe esfriar e desenforme sobre um prato raso.");
                break;


            case "Crumble de Goiaba":
                Ingredientes.setText("- 80g de manteiga gelada sem sal, cortada em cubinhos\n- 160g de farinha de trigo\n- 230g de açúcar refinado\n- 600g de goiaba sem pele e sem sementes\n- 50g de castanhas-do-pará picadas.\n- Para o creme inglês: \n- 250 ml de leite\n- 1/4 de fava de baunilha\n- 75g de açúcar\n- 3 gemas");
                Preparo.setText("Corte as goiabas em pequenos pedaços e leve à panela com 100g de açúcar. Cozinhe apenas o suficiente para o açúcar dissolver. Coloque em um refratário e reserve. Preaqueça o forno a 180º C. Misture a farinha com a manteiga, sem amassar. Quando formar uma farofa, acrescente as castanhas, o restante do açúcar e mexa. Espalhe a farofa por cima das goiabas no refratário, sem apertar. Leve ao forno por 30 minutos ou até que a farofa doure. Enquanto isso, prepare o creme inglês. Ferva o leite com a baunilha e metade do açúcar. Bata o açúcar restante com as gemas até ficar homogêneo. Despeje o leite fervido na mistura com as gemas. Leve a nova mistura à panela, cozinhando em fogo baixo por poucos minutos. Sirva o crumble bem quente com creme inglês à parte, em uma jarra, morno.");
                break;


            case "Compota de Goiaba":
                Ingredientes.setText("- 2 kg de goiabas vermelhas maduras\n- 1 ½ xícara (chá) de açúcar cristal\n- 3 xícaras (chá) de água\n- 1 rama de canela");
                Preparo.setText("Com o descascador de legumes (ou uma faca bem afiada), descasque as goiabas com cuidado para manter o formato da fruta bem redondinho. Corte cada goiaba ao meio e, com uma colher de sobremesa, retire o miolo com as sementes – você pode reservar esta parte da fruta na geladeira e preparar um suco. Numa panela média misture a água com o açúcar. Junte a rama de canela e leve ao fogo médio. Deixe cozinhar sem mexer por 5 minutos depois de ferver, para formar uma calda rala. Mergulhe as goiabas na calda e espere ferver novamente. Abaixe o fogo e deixe cozinhar por 20 minutos – nesse tempo as goiabas ficam macias, absorvem o açúcar e também passam sabor à calda. Atenção ao tempo: caso as goiabas estejam muito maduras deixe cozinhar por menos tempo pois podem desmanchar. Para verificar o ponto: espete as frutas com um garfo, elas devem estar macias, mas sem desmanchar. Desligue o fogo e transfira as goiabas com a calda para uma compoteira. Deixe esfriar completamente antes de fechar e levar à geladeira. Sirva gelada.");
                break;


            case "Flan de Goiaba":
                Ingredientes.setText("- 1 envelope de gelatina sem sabor\n- 6 goiabas médias vermelhas ou uma lata de suco de goiaba\n- 1 lata de leite condensado\n- 1 colher de café de Cardamomo em Pó\n- 3 colheres de sopa de suco de limão");
                Preparo.setText("Dissolva a gelatina em 6 colheres de sopa de água fria. Leve ao fogo em banho-maria até dissolver e reserve. Descasque e pique as goiabas. Bata-as no liquidificador com meia medida de lata de água. Retire e passe por peneira fina. Misture em uma tigela o leite condensado, meia medida de lata de água, o cardamomo, as goiabas e o suco de limão. Acrescente a gelatina dissolvida e mexa bem. Despeje em forma com furo central ou em pequenas formas para porções individuais levemente untadas com óleo sem sabor e leve à geladeira por cerca de 4 horas.");
                break;


            case "Goiabada":
                Ingredientes.setText("- 1 quilo de goiabas vermelhas e maduras\n- 1 xícara de chá de açúcar refinado");
                Preparo.setText("Lave as goiabas;Corte as goiabas ao meio, retire toda a polpa e reserve;Passe a polpa da goiaba em uma peneira até que sobrem somente as sementes;Em um tacho de cobre, coloque a polpa, as cascas das goiabas e o açúcar;Cozinhe em fogo médio, mexendo sempre, até que as cascas fiquem cozidas;Espere esfriar e sirva.");
                break;


            case "Bolo de Goiaba":
                Ingredientes.setText("- 4 ovos\n- 1 xícara (chá) de suco concentrado de Goiaba\n- 1 xícara (chá) de óleo\n- 2 xícaras (chá) de açúcar\n- 3 xícaras (chá) de farinha de trigo\n- 1 colher (sopa) de fermento\n- Calda de Goiaba\n- 4 goiabas vermelhas maduras descascadas\n- 1 xícara (chá) de açúcar\n- 1 xícara (chá) de água");
                Preparo.setText("Bolo: Em um liquidificador bata os ovos o suco o óleo e acrescente gradativamente o açúcar a farinha e por último o fermento em pó. Asse em forma redonda de orifício central (de 26 cm de diâmetro por 8 cm de altura), untada e enfarinhada em forno pré aquecido a 180°C até que fique dourado. Calda: Tire a polpa de duas Goiabas e separe, pique em tiras e reserve, as outras duas Goiabas descasque e junte com a polpa reservada e bata com o água e o açúcar e coe. Em uma panela fogo médio coloque a polpa coada e acrescente as goiabas cortadas em tiras e deixe apurar, Depois de fria coloque sobre o bolo. Decore a gosto.");
                break;

            case "Goiaba Assada com Mel":
                Ingredientes.setText("- 6 goiabas\n- 1 colher (sopa) mel\n- 1 colher (sopa) açúcar\n- canela para polvilhar");
                Preparo.setText("Lave bem as frutas. Elas não serão descascadas. Corte cada uma delas em quatro partes e disponha esses gominhos em uma travessa. Espalhe o mel sobre eles. Disponha os pedaços de goiabas já envolvidos pelo mel em uma assadeira, com a casca virada para baixo. Salpique açúcar e leve ao forno pré-aquecido em temperatura alta (300 graus) por mais ou menos quatro minutos. Retire do forno e polvilhe canela por cima da fruta assada.");
                break;


            case "Pudim de Limão":
                Ingredientes.setText("- 360ml de ÁGUA\n- 200 gramas de AÇÚCAR\n- 65ml de SUCO DE LIMÃO SICILIANO\n- 60ml de SUCO DE LIMÃO TAITI\n- 6 GEMAS\n- 45 gramas de AMIDO DE MILHO\n- raspas de 2 LIMÕES (1 SICILIANO E 1 TAITI)\n- 1/4 colher de chá de SAL\n- 30 gramas de MANTEIGA SEM SAL GELADA E CORTADA EM CUBOS");
                Preparo.setText("Peneire as gemas para retirar a película. Em uma panela, misture todos os ingredientes exceto a manteiga. Leve ao fogo baixo, mexendo sempre até engrossar (quase quando começar a ferver). Retire do fogo e acrescente a manteiga. Mexa até incorporar. Empregue ainda quente na torta. Coloque na geladeira para gelar (no caso de tortas). DICAS: Quanto mais velhos forem os ovos usados, mais a gema fica com aquele cheiro forte característico, portanto sempre use ovos frescos. Se você quiser substituir o suco do limão taiti pelo limão siciliano, o recheio ficará menos ácido e mais perfumado. No entando, não aconselharia o contrário, pois o recheio ficará muito azedo. Para mim, a melhor massa de torta para empregar o lemon curd é a sucrée, pois ela é a mais doce de todas. Ela tem que estar assada e fria antes de você colocar o recheio. DURAÇÃO: 1 semana..");
                break;

            case "Lemon Curd - Creme de Limão":
                Ingredientes.setText("- 4 limões tahiti\n- 1 limão siciliano\n- 2 latas de leite condensado\n- 2 latas de creme de leite sem soro\n- 2 pacotinhos de gelatina sem sabor");
                Preparo.setText("Em uma panela misture todos os ingredientes, exceto a manteiga. Leve ao fogo baixo, mexendo sempre até engrossar. Retire do fogo e acrescente a manteiga e mexa bem. Deixe esfriar.");
                break;


            case "Torta de Limão - Chessecake de Limão":
                Ingredientes.setText("- 360ml de água\n- 200g de açúcar\n- 65ml de suco de limão siciliano\n- 60ml de suco de limão\n- 6 gemas\n- 50g de amido de milho\n- 2 limões – raspas (1 siciliano e um taiti)\n- 1/4 de colher (chá) de sal\n- 30g de manteiga sem sal");
                Preparo.setText("Em uma panela misture todos os ingredientes, exceto a manteiga. Leve ao fogo baixo, mexendo sempre até engrossar. Retire do fogo e acrescente a manteiga e mexa bem. Deixe esfriar.");
                break;


            case "Bolo de Limão":
                Ingredientes.setText("- Massa:\n- 3 ovos (150 g)\n- 2 Xícaras de açúcar refinado (400 g)\n- 2 1/2 xícaras de farinha de trigo (500 g)\n- 3 colheres de margarina (150 g)\n- 1 colher de sopa de fermento\n- 70 ml de suco de limão taiti (aproximadamente 3)\n- Cobertura:\n- 40 ml de suco de limão taiti (aproximadamente 2)\n- 1 lata de leite condensado");
                Preparo.setText("Para a Massa: Misture os ovos, o açúcar e a margarina. Bata bem até mudar de cor e ficar mais clarinho. Acrescente a farinha de trigo e o suco misture e por último misture o fermento. Para a CoberturaMisture o leite condensado com o suco e pronto. Modo de Preparo - OBS: Depois do bolo pronto coloque a cobertura em temperatura ambiente. Rende uma forma de 22 cm. Coloque no forno a 180º até ficar dourado e firme. (faça o teste do palito de dente)");
                break;



            case "Cupcake de Limão":
                Ingredientes.setText("- 150g de farinha de trigo\n- 1 colher (chá) de fermento em pó\n- 1 pitada de sal\n- 1 colher (chá) de bicarbonato de sódio\n- 1 ovo\n- 70g de manteiga sem sal derretida\n- 150g de açúcar\n- 160g de iogurte natural\n- 1 limão-taiti (suco)\n- 20g de manteiga sem sal fria");
                Preparo.setText("Farofa doce: 30 g de farinha de trigo30 g de açúcar20 g de manteiga sem sal friaPara a massa: 120 g de farinha de trigo1 colher (chá) de fermento em póuma pitada de sal1 colher (café) de bicarbonato de sódio1 ovo70 g de manteiga sem sal derretida120 g de açúcar160 g de iogurte naturalraspas de casca de limão-taitisuco de 1/2 limão-taitiPara preparar a farofa doce, misture todos os ingredientes com as mãos até que estejam uniformemente integrados. Pré aqueça o forno a 200ºC. Prepare a massa. Em uma tigela peneire a farinha, o fermento, o sal e o bicarbonato. Reserve. Em outra tigela, misture o ovo com a manteiga e bata com um batedor manual. Acrescente o açúcar e bata bem. Junte o iogurte, as raspas e o suco de limão. Aos poucos, acrescente os ingredientes secos reservados e misture bem. Encha três quartos das forminhas com a massa e complemente com a farofa doce. Leve ao forno por 20 minutos ou até que a massa esteja assada.");
                break;




            case "Mousse Fácil de Limão":
                Ingredientes.setText("- 1 lata de leite condensado\n- 1 lata de creme de leite\n- Suco de 2 limões médios");
                Preparo.setText("Bata bem todos os ingredientes no liquidificador;Despeje o conteúdo em um refratário ou em taças individuais;Acrescente raspas de limão para um toque especialPonha pra gelar por no mínimo 2h;Sirva gelado.");
                break;



            case "Brigadeiro Branco com Limão":
                Ingredientes.setText("- 3 unidades de ovo\n- 3 unidades de gema de ovo\n- 1 lata de leite condensado\n- 1 lata de creme de leite\n- 1 xícara (chá) de leite em pó\n- 1 limão (suco e raspas da casca)");
                Preparo.setText("Derreta o chocolate branco em banho-maria ou no micro-ondas. No liquidificador, bata os ovos, as gemas, o leite condensado, o creme de leite, o leite em pó, o chocolate branco derretido e o suco de limão. Misture as raspas de limão, coloque em uma forma para pudim untada com margarina e polvilhada com açúcar. Asse em banho maria no forno, preaquecido a 200 °C, durante 50 minutos ou até, que espetando um palito saia limpo. Deixe esfriar, desenforme e sirva gelado.");
                break;



            case "Madeleines de Limão":
                Ingredientes.setText("- INGREDIENTES: MADELEINES DE LIMÃO\n- 2 OVOS\n- 1/3 de xícara de AÇÚCAR REFINADO\n- 2 colheres de sopa de MEL\n- 3/4 de xícara de FARINHA DE TRIGO peneirada\n- 1 colher de sobremesa de AMIDO DE MILHO\n- 1/2 colher de chá de FERMENTO EM PÓ\n- 30 gramas de CREME DE LEITE\n- Uma pitada de SAL\n- Raspas de 2 LIMÕES\n- 2 colheres de sopa de SUCO DE LIMÃO\n- 130 gramas de MANTEIGA SEM SAL para fazer a Beurre Noisette\n- INGREDIENTES: COBERTURA\n- 150 gramas de CHOCOLATE BRANCO\n- Raspas de LIMÃO");
                Preparo.setText("Comece batendo em uma tigela os ovos, o açúcar e o mel. Por cima dessa mistura, peneire a farinha, o amido de milho e o fermento em pó. Incorpore os secos delicadamente até obter uma massa homogênea. Acrescente o creme de leite, o sal, junto com as raspas e o suco dos limões. DICA: Você pode substituir as raspas do limão taiti pelo siciliano, laranja, mexirica ou mesmo por um pouco de canela e outras especiarias. Misture novamente e cubra a tigela com plástico filme. Leve à geladeira por 2 horas para que a massa descanse. Enquanto isso, prepare a beurre noisette (é uma manteiga com gostinho de avelã). Derreta a manteiga em uma panelinha até que se forme uma espuma branca. No fundo da panela, vão se formar cristais de cor marrom (isso é o açúcar da manteiga se caramelizando). Desligue o fogo e deixe a manteiga esfriar até aproximadamente 30°C (bem morna). Junte a manteiga na massa e misture bem. Transfira a massa para um saco de confeitar, se você estiver usando uma forma específica para madeleines, ou diretamente para uma forma de bolo. Asse em forno preaquecido a 180°C por aproximadamente 15 minutos ou até que suas madeleines estejam douradas. Derreta o chocolate branco e banhe as madeleines, completando com raspas de limão para decorar.");
                break;



            case "Bolo de Sorvete de Limão":
                Ingredientes.setText("- iNGREDIENTES: MASSA\n- 230 gramas de MANTEIGA SEM SAL\n- 180 gramas de AÇÚCAR CRISTAL\n- 4 OVOS\n- 240 gramas de FARINHA DE TRIGO peneirada\n- 10 gramas de FERMENTO EM PÓ\n- Uma pitada de SAL\n- 80 ml de SUCO DE LIMÃO\n- Raspas de 2 LIMÕES SICILIANOS\n- INGREDIENTES: SORVETE\n- 2 latas de CREME DE LEITE de latinha (sem o soro)\n- 2 latas de LEITE CONDENSADO\n- 2 latas de SUCO DE LIMÃO (eu misturei limão siciliano e limão tahiti)\n- 40ml de LIMONCELLO (licor de limão)");
                Preparo.setText("mODO DE PREPARO: MASSABata a manteiga e o açúcar até obter uma massa fofa e branca. Adicione os ovos um a um, batendo bem a cada adição. Misture a farinha com o fermento e o sal e peneire. Acrescente a farinha aos poucos, intercalando com o suco. Coloque as raspas dos limões e misture. Jogue a massa dentro de uma fôrma de 21 cm, untada e enfarinhada. Leve para assar em forno preaquecido a 170°C até que você espete um palito no centro e ele saia limpo. Retire do forno e deixe esfriar. Corte o topo do bolo, para ele ficar retinho, igualando-o. MODO DE PREPARO: SORVETEBata todos os ingredientes no liquidificador. MONTAGEMEm uma forma de 21 cm coloque folhas de acetato por dentro de toda a borda. Coloque o pedaço do bolo no fundo da forma e depois jogue todo o sorvete por cima. Leve para o congelador por 6 horas. Retire do congelador e sirva! Para conservar, depois de comer, o bolo tem que voltar para o congelador e ser tirado com 20 minutos antes de servir novamente.");
                break;



            case "Mousse de Maracujá":
                Ingredientes.setText("- 1 lata de leite condensado\n- 1 lata de suco de maracujá (medida pela lata de leite condensado)\n- 1 lata de creme de leite sem soro");
                Preparo.setText("Em um liquidificador, bata o creme de leite, o leite condensado e o suco concentrado de maracujá. Em uma tigela, despeje a mistura e leve à geladeira por, no mínimo, 4 horas. INFORMAÇÕES ADICIONAIS: Para fazer a calda, você só precisa misturar 1 xícara de polpa de maracujá com 1/2 xícara de açúcar. Leve à uma panela, em fogo baixo, mexa bem e deixe ferver. Mexa mais um pouco até ficar em ponto de calda. Depois é só levar à geladeira junto com a mousse.");
                break;



            case "Tiramisu de Maracujá":
                Ingredientes.setText("- 3 ovos grandes, gemas e claras separadas\n- ½ xícara de açúcar\n- ½ colher de sopa de rum, opcional\n- 450g de queijo mascarpone, em temperatura ambiente\n- Aproximadamente 2 xícaras de concentrado de maracujá ou suco fresco, feito com 8-10 maracujás grandes. Pode substituir por polpa congelada que você encontra nas lojas latinas.\n- 2 pacotes de bolacha champanhe (pacote de 130g)\n- Polpa de maracujá fresca (com sementes) para enfeitar, cerca de 2-4 maracujás");
                Preparo.setText("Em uma tigela média, bata as gemas com açúcar e rum, até que vire uma espuma. Em outra tigela, bata as claras em neve. Adicione o queijo mascarpone às claras batidas, gentilmente usando uma colher para adicionar as gemas com açúcar também. Molhe cada bolacha champanhe no concentrado de maracujá até que estejam bem molhadas mas não encharcadas. Coloque as bolachas molhadas em uma tigela retangular ou quadrada até ter uma camada cheia – corte algumas ao meio se precisar, para cobrir todo o fundo da tigela. Cubra as bolachas com a mistura de mascarpone e um pouco de polpa fresca de maracujá (se tiver o suficiente – senão reserve para a cobertura). Faça outra camada de bolacha champanhe molhada. Finalize com uma camada final da mistura de queijo mascarpone. Deixe na geladeira por pelo menos 6 horas. De um dia para o outro é o ideal. Com uma colher, coloque a polpa de maracujá fresco por cima do tiramisu antes de servir.");
                break;



            case "Flan de Maracujá com Iogurte":
                Ingredientes.setText("- 2 Maracujás (Grandes)\n- 1 xícara (chá) de Água\n- 1 xícara e ½ de Açúcar\n- 1 Pacote de Gelatina Sem Sabor e Incolor\n- 1 Colher (chá) de Amido de Milho (maisena)\n- 3 Potes de Iogurte Natural (+ou- 510g)\n- 2 Colheres (sopa) de Água");
                Preparo.setText("Comece fazendo o suco concentrado batendo a polpa do 2 maracujás com ½ xícara (chá) de Água, passe tudo por uma peneira e reserve. No mesmo liquidificador adicione ½ xícara (chá) de Suco de Maracujá, 1 xícara (chá) de açúcar, e os 3 potes de iogurtes e batata muito bem. Adicione a gelatina incolor já hidratada de acordo com o fabricante e batata por mais 3 minutos. Coloque em copinhos individuais ou em uma forma de pudim de no máximo 20cm bem untada com algum tipo de óleo (usamos canola por não ter sabor). Leve para gelar por no mínimo 3 horas. Para a calda coloque em uma panela mais ½ xícara (chá) de suco de maracujá, ½ xícara (chá) de água, ½ xícara (chá) de açúcar e o amido de milho dissolvido em 2 colheres (sopa) de água e deixe cozinhar em fogo baixo misturando sempre até que fique levemente cremoso. Sirva tudo bem gelado!");
                break;



            case "Minis sonhos de Maracujá":
                Ingredientes.setText("- 30 gramas de fermento fresco biológico - massa\n- 2 colheres de sopa de açúcar - massa\n- 200 ml de leite - massa\n- 2 unidades de Ovo - massa\n- 2 unidades de gema - massa\n- 100 gramas de manteiga - massa\n- 1/2 colher de chá de essência de baunilha - massa\n- 1/2 unidade de laranja (raspas) - massa\n- 500 gramas de trigo (aproximadamente) - massa\n- a gosto de óleo para fritar - massa\n- 1 lata de leite condensado - recheio de maracujá\n- 1/2 lata de leite (mesma medida do leite condensado) - recheio de maracujá\n- 1/2 lata de suco de maracujá - recheio de maracujá\n- 3 colheres de sopa de amido de milho - recheio de maracujá\n- 1 caixa de creme de leite (200g) - recheio de maracujá");
                Preparo.setText("Dissolva o fermento com o açúcar e acrescente o restante dos ingredientes e o trigo até o ponto de uma massa bem macia. Deixe descansar por 15 minutos. Divida a massa em porções de 15 gramas. Faça bolinhas com cada porção e deixe crescer até dobrar de volume. Asse em forno pré-aquecido a 150 graus C até dourar levemente. Logo após sair do forno, frite por imersão em óleo quente. Para fazer o recheio, coloque o leite condensado, o leite, o suco de maracujá e o amido de milho em uma panela e leve ao fogo. Deixe engrossar. Desligue o fogo e acrescente o creme de leite. Mexa até ficar homogêneo. Montagem: Corte os sonhos ao meio e recheie-os com o creme frio. Polvilhe açúcar impalpável para finalizar. ");

                break;



            case "Brigadeiro de Maracujá":
                Ingredientes.setText("- 4 colheres (sopa) de suco de maracujá-do-mato (maracujá verde, fruta do semiárido nordestino)\n- 1 colher (chá) de açúcar\n- 1 colher (sopa) de lascas da casca do maracujá-do-mato\n- 1 lata de leite condensado\n- 1 caixa de creme de leite (200 g)\n- Açúcar cristal para envolver");
                Preparo.setText("Misture metade do suco de maracujá com o açúcar e as lascas da casca em uma panela e leve ao fogo médio, mexendo sempre, por uns 3 minutos ou até formar uma geleia. Reserve. Leve o leite condensado com o creme de leite ao fogo médio, mexendo sem parar, por 15 minutos ou até engrossar. Fora do fogo, acrescente o suco de maracujá restante e misture até ficar homogêneo. Transfira para um prato, cubra com filme plástico em contato com o doce e deixe esfriar. Com as mãos umedecidas, modele bolinhas com pequenas porções do doce, envolva em açúcar cristal e leve à geladeira por 30 minutos. Queime o açúcar com maçarico culinário e sirva com a geleia de maracujá.");
                break;


            case "Cocada de Maracujá":
                Ingredientes.setText("- 200g de coco fresco ralado\n- 3/4xícara (chá) de suco de maracujá concentrado\n- 100g de açúcar cristal\n- 1lata de leite condensado\n- 1/2xícara (chá) de Leite de coco");
                Preparo.setText("Em uma panela de fundo grosso, junte todos os ingredientes, exceto o leite de coco, e cozinhe em fogo médio, mexendo sempre, por 12 minutos ou até o doce engrossar. Fora do fogo, agregue o leite de coco e misture bem. Deixe esfriar ligeiramente e distribua a cocada em 20 colheres próprias para doces de colher. Sirva morna ou em temperatura ambiente.");
                break;



            case "Pudim de Maracujá com cobertura de Iogurte":
                Ingredientes.setText("- Cobertura:\n- 2 envelopes (24 g) de gelatina em pó incolor hidratada e derretida conforme instruções da embalagem\n- ½ xícara (chá) de água (100 ml)\n- 2 potes (340 g) de iogurte natural \n- 1/3 de xícara (chá) de açúcar \n- 1 colher (chá) de essência de baunilha \n- Óleo para untar \n- Pudim:\n- 1 e ½ xícara (chá) de suco de maracujá concentrado (300 ml)\n- 1 lata de leite condensado \n- 1 caixinha (200 g) de creme de leite \n- 1 e ½ envelope (18 g) de gelatina em pó incolor hidratada e derretida conforme instruções da embalagem \n- Calda:\n- Polpa de 1 maracujá azedo grande \n- ½ xícara (chá) de água \n- 1 xícara (chá) de açúcar");
                Preparo.setText("Cobertura: Bata os ingredientes no liquidificador apenas até homogeneizar e despeje em fôrma retangular (23 x 35 cm) untada com óleo e passada em água fria. Leve à geladeira até firmar. Corte em pedaços a gelatina de iogurte para forrar uma fôrma de bolo inglês (10 x 24 cm) untada com óleo e passada em água fria. Retire os pedaços com cuidado. Reserve. Pudim: Misture os ingredientes e acomode a vasilha com a mistura em uma tigela com água e cubos de gelo (banho-maria frio). Misture até engrossar e ficar com consistência de clara de ovo crua. Despeje na fôrma preparada e leve à geladeira até firmar. Desenforme a sobremesa em uma travessa e regue com a calda. ·     Calda: Leve os ingredientes ao fogo baixo e cozinhe até espessar ligeiramente. Deixe esfriar.");
                break;


            case "Cheesecake de Maracujá":
                Ingredientes.setText("");
                Preparo.setText("");
                break;



            case "Antepasto de Pimentão Assado":
                Ingredientes.setText("- 1 pimentão vermelho grande\n- 1 pimentão amarelo grande\n- 1 pimentão verde grande\n- 4 dentes de alho fatiados\n- 1/2 xícara de azeite\n- 2 colheres de sopa de vinagre\n- 1/2 colher de chá de páprica picante\n- sal e pimenta a gosto");
                Preparo.setText("Lave e seque bem os pimentões. Besunte-os com azeite e leve ao forno preaquecido em uma forma para assar. A cada 10 minutos vire os pimentões, deixando todos os lados meio queimadinhos. Asse por cerca de 30 a 40 minutos. Coloque os pimentões assados em um saco ou pote plástico e feche. Deixe descansar por 10 minutos. Pegue os pimentões, com uma faca retire a parte de cima do talo e puxe para retirar as sementes. Abra os pimentões e retire de dentro as sementes que ficaram, e tire toda a pele por fora dos pimentões. Corte-os em tiras finas e reserve. Em uma frigideira em fogo baixo, leve para refogar sem dourar o alho com um pouco do azeite e junte os pimentões. Misturando o restante do azeite com a páprica picante e o vinagre e coloque sobre os pimentões. Misture tudo com cuidado, para não quebrar as fatias de alho. Acerte o sal e a pimenta a gosto. Deixe descansar na geladeira por pelo menos 12 horas antes de servir para apurar o sabor.");
                break;

            case "Geléia de Pimentão":
                Ingredientes.setText("- 1 pimentão amarelo\n- 1 pimentão vermelho\n- 1 pimentão verde\n- 1 xícara (chá) de vinagre de maçã\n- 1 xícara (chá) de açúcar\n- 1 pitada de sal");
                Preparo.setText("O primeiro passo é higienizar bem os pimentões. Em seguida, corte-os em pedacinhos pequenos, removendo os talos e as sementes. Em uma panela grande, coloque os pimentões picados, o vinagre e o açúcar. Misture bem e leve para cozinhar em fogo baixo até que a geleia fique bem consistente. De vez em quando, dê uma leve mexida na panela. Quando estiver na consistência de sua preferência, transfira a geleia para um recipiente de vidro. Leve para geladeira por 4 horas ou até que tenha gelado por completo. Dicas: – É importante tomar cuidado para ela não queimar, por isso o fogo deve ser bem brando. – Quanto mais tempo a geleia cozinhar, mais consistente ela ficará. Ela também tende a dar uma leve escurecida. – A geleia de pimentão pode ser servida com queijos, torradas e biscoitos. No entanto, não se prenda a isso. Ela também pode dar um toque especial àquele frango assado ou um delicioso porco grelhado. Pote de vidro");
                break;

            case "Pimentão Recheador com Carne Móida":
                Ingredientes.setText("- 2 pimentões médios ou grandes\n- 300 g de carne moída\n- 1/2 cebola picada\n- 2 dentes de alho picado\n- Sal a gosto\n- 1 pedaço pequeno de bacon (opcional)\n- 1 cenoura pequena (opcional)\n- 2 fatias de presunto\n- 2 fatias de queijo\n- 3 colheres (sopa) de requeijão");
                Preparo.setText("Lave bem os pimentões. Faça um buraco no pé de cada pimentão, como uma tampa. Retire toda a semente de dentro limpando tudo. Deixe reservado. Tempere a carne e deixe reservada também. RECHEIO: Refogue a cebola e o alho picados. Acrescente o bacon cortado em cubos. Deixe dourar. Coloque a Carne moída e mexa bem. Misture a cenoura cortada em cubos. Coloque um copo de água e deixe cozinhar até a cenoura cozinhar e secar a água. Corte as fatias do presunto e queijo em pedaços pequenos. Acrescente à carne e desligue o fogo. Coloque o requeijão e mexa bem. Pegue os pimentões, coloque o recheio dentro preenchendo por completo. Corte um pedaço de papel alumínio ( proporcional ao pimentão ) e cubra cada pimentão. Coloque-os em uma forma de alumínio ou refratária. Leve ao forno pré-aquecido, a 220º, por 20 minutos. Sirva de preferência bem quentinho.");
                break;

            case "Molho de Pimentão Vermelho Assado":
                Ingredientes.setText("- 1 pimentão vermelho grande\n- 1 cebola branca grande\n- 2 xícaras de leite de amêndoas (ou outro leite vegetal neutro)\n- 1 colher (chá) de sal\n- 1 colher (chá) de alho em pó\n- 1/4 de colher (chá) de cominho\n- pitada de pimenta do reino\n- 1 colher (sopa) de polvilho doce");
                Preparo.setText("Posicione o pimentão vermelho e a cebola, devidamente higienizados, em uma assadeira e leve ao forno médio-alto até que ambos fiquem macios e a pele do pimentão esteja soltando. Isso leva cerca de 20 a 30 minutos. Quando estiver pronto, retire do forno, deixe esfriar e, em seguida, descasque-os e descarte as sementes do pimentão. Em um liquidificador, junte o pimentão vermelho e a cebola assada, o leite vegetal, o sal, o alho em pó, o cominho e a pimenta do reino. Bata até ficar bem homogêneo. Prove e ajuste os temperos conforme seu paladar. Adicione, então, o polvilho doce e bata no liquidificador até que ele fique bem incorporado. Leve a mistura a uma panela e cozinhe em fogo médio até engrossar. Sirva como preferir. O Molho de Pimentão Vermelho Assado pode acompanhar o macarrão, ser usado na lasanha ou como acompanhamento para outros pratos, como legumes e batatas assadas.");
                break;

            case "Chutney de Pimentão":
                Ingredientes.setText("- 1 cebola roxa cortada em tiras\n- 1 pimentão vermelho cortado em cubos\n- 1 pimentão amarelo cortado em cubos\n- 1 dente de alho picado\n- 1 pimenta dedo-de-moça picada\n- ½ maça ralada com casca e sem semente\n- 1 xícara de açúcar mascavo\n- ½ xícara de vinagre de vinagre de maçã\n- 1 colher de chá de canela em pó\n- 1 folha de louro\n- Azeite de oliva");
                Preparo.setText("Refogar em um fio de azeite, a cebola, os pimentões, o alho e a pimenta. Adicionar a maçã ralada. Adicionar o açúcar mascavo, o vinagre, a canela e o louro. Deixar cozinhar até que caramelize. Guardar em vidrinhos.");
                break;

            case "Abobrinha Gratinada":
                Ingredientes.setText("- 2 abobrinhas\n- 1/2 cebola picadinha\n- 2 dentes de alho amassados\n- 1 caldo de galinha\n- 1 colher (sopa) de manteiga\n- 2 ovos\n- 1 lata de creme de leite\n- 200 g de queijo mussarela\n- 1/2 pacote de queijo ralado\n- cebolinha a gosto\n- sal e pimenta-do-reino a gosto");
                Preparo.setText("Corte a abobrinha em rodelas médias. Em seguida, disponha-as em um refratário que possa ir ao forno. Reserve. Usando um liquidificador ou um mixer, misture o creme de leite com os ovos, o caldo de galinha e o queijo ralado. Assim que o creme estiver homogêneo, reserve-o. Em uma panela, aqueça a manteiga e adicione o alho e a cebola. Refogue em fogo médio até que estejam douradas. Despeje o conteúdo do liquidificador na panela e refogue bem. Deixe ferver e acerte o sal. Adicione pimenta-do-reino a gosto. Despeje o creme por cima das rodelas de abobrinha. Cubra com a mussarela e salpique cebolinha a gosto. Leve ao forno preaquecido a 180º C por aproximadamente 40 minutos. Sirva quente!");
                break;

            case "Macarrão com Abobrinha com Manjericão":
                Ingredientes.setText("- 3 abobrinhas italianas médias\n- 2 colheres (sopa) de azeite\n- 2 dentes de alho fatiados\n- 10 folhas de manjericão\n- meia colher (chá) de sal\n- 1 pitada de pimenta-do-reino (opcional)\n- 1 colher (sopa) de queijo parmesão ralado ou queijo branco ralado (opcional)");
                Preparo.setText("Com o auxílio de uma faca, fatie as abobrinhas em laminas finas, no sentido do comprimento e corte cada fatia em tiras bem finas, como um espaguete. Coloque-as aos poucos em água fervente com sal e cozinhe rapidamente (cerca de 1 minuto) apenas para que amoleça levemente. Escorra, transfira para água gelada (para interromper o cozimento) e reserve. Em uma frigideira grande aqueça o azeite e refogue o alho, sem deixar dourar. Junte o manjericão, o sal, a pimenta-do-reino e as abobrinhas reservadas e misture delicadamente, para incorporar o tempero e não partir as tiras. Transfira para um prato grande, polvilhe com o queijo ralado e sirva a seguir. DICA: Se desejar, faça as tiras de abobrinha usando um ralador de legumes, passando-as no ralo grosso no sentido do comprimento.");
                break;

            case "Abobrinha de Forno com Tomate":
                Ingredientes.setText("- 2 cebolas médias em fatias finas\n- 4 dentes de alho em fatias finas\n- 1 abobrinha grande em rodelas finas\n- 3 tomates médios em rodelas\n- Parmesão ralado a gosto / Ervas a gosto\n- Sal e pimenta-do-reino");
                Preparo.setText("Espalhe em um refratário as cebolas em fatias e os dentes de alho. Por cima faça uma camada intercalando rodelas de abobrinha com rodelas de tomatePolvilhe com ervas a gosto, sal e pimenta-do-reino e regue com azeite. Por cima polvilhe com queijo ralado. Leve ao forno por aproximadamente 40 minutos ou até que os legumes estejam cozidos e o queijo gratinado.");
                break;

            case "Rolinhos de Abobrinha (Wrap de Abobrinha)":
                Ingredientes.setText("- 300g de abobrinha\n- 1 ovo grande\n- 1/4 xícara (chá) (25g) de queijo parmesão ralado no ralo fino\n- 1/4 xícara (chá) (25g) de amido de milho\n- Sal a gosto\n- Pimenta-do-reino moída a gosto\n- 1/4 xícara (chá) de cebolinha picada\n- Creme de ricota\n- Peito de peru fatiado\n- Alface\n- Tomate (sem sementes, em tiras)");
                Preparo.setText("Rale 300g de abobrinha no ralo grosso, coloque em um pano seco, esprema com as mãos até retirar todo o líquido e reserve. (Rende 2 xícaras de chá)Numa tigela, coloque a abobrinha (ralada e espremida), 1 ovo grande, ¼ xícara (chá) de queijo parmesão ralado no ralo fino, ¼ xícara (chá) de amido de milho, sal e pimenta-do-reino moída a gosto, ¼ xícara (chá) de cebolinha picada e misture até formar uma massa homogênea. Transfira metade da massa para uma frigideira antiaderente (20 cm de diâmetro), untada com 1 fio de azeite. Espalhe bem a massa até cobrir todo fundo da frigideira. Deixe cozinhar em fogo baixo até começar a dourar (+/- 2 minutos). Com uma espátula vire o disco de massa com cuidado e deixe por mais 1 minuto ou até dourar levemente do outro lado. Retire o disco de abobrinha da frigideira e faça outro disco com o restante da massa. Coloque o disco de abobrinha sobre papel filme, espalhe um pouco de creme de ricota, distribua fatias de peito de peru defumado, fatias de alface e tiras de tomate sem sementes. Enrole, apertando bem com ajuda do filme plástico e leve à geladeira para firmar. Sirva em seguida. DICA: para fazer o misto quente de abobrinha, coloque ¼ da massa na frigideira e com uma espátula dê formato de quadrado com 11 cm de lateral. Doure dos dois lados e reserve. Faça este procedimento mais 3 vezes com o restante da massa. Depois, na hora de servir, coloque um quadrado de abobrinha dourado na frigideira, coloque queijo e presunto e outro quadrado de abobrinha dourado, deixe esquentar para derreter o queijo e sirva em seguida.");
                break;

            case "Quibe de Abobrinha na Travessa":
                Ingredientes.setText("- 1 cebola picada\n- 2 dentes de alho picados\n- 2 abobrinhas pequenas raladas\n- 2 xícaras de trigo para kibe\n- 3 xícaras de água fervente\n- Azeite de oliva\n- Sal\n- 1 colher de chá de pimenta síria\n- 2 xícaras de creme ricota\n- 2 xícaras de ricota\n- Folhas de hortelã a gosto\n- Salsinha picada a gosto");
                Preparo.setText("Em uma panela, colocar um fio de azeite e refogar a cebola por 3 minutos. Adicionar o alho e refogar por mais 2 minutos. Acrescentar as abobrinhas raladas e refogar por 5 minutos. Em um recipiente, colocar o trigo para kibe e adicionar a água fervente para hidratar. Em um recipiente, misturar a ricota, o creme de ricota e a hortelã. Reservar. Misturar a abobrinha refogada com o trigo hidratado. Temperar com sal, pimenta síria e salsinha. Em um refratário, fazer uma camada do trigo com abobrinha, colocar o creme de ricota e finalizar com mais uma camada de trigo com abobrinha. Levar ao forno preaquecido a 180 graus por 30 minutos ou até que esteja levemente dourado.");
                break;

            case "Lasanha de Abobrinha":
                Ingredientes.setText("- 1 xícara (chá) de molho de tomate\n- 1 cebola picada\n- 1/4 colher (chá) de manjericão picado\n- 1/4 colher (chá) de orégano\n- 1 xícara (chá) de ricota\n- 1/2 xícara (chá) de queijo mussarela ralado grosso\n- 1 colher (chá) de salsa (ou salsinha)\n- 3 abobrinhas\n- 1 tomate cortado em fatias\n- 2 colheres (sopa) de queijo parmesão ralado\n- sal a gosto");
                Preparo.setText("Junte molho de tomate, a cebola, o manjericão, o sal e o orégano. Reserve. Em uma tigela, misture a ricota, a mussarela e a salsinha. Reserve. Descasque as abobrinhas e corte-a em fatias horizontais. Disponha-as em um refratário e cubra com papel-manteiga. Leve ao micro-ondas, em alta potência, por 6 a 8 minutos, ou até o legume ficar macio. Vire a abobrinha na metade do cozimento. Coloque os pedaços sobre papel-toalha para tirar a umidade. Em um refratário untado, faça uma camada com metade da abobrinha e, por cima, adicione ricota. Espalhe o tomate fatiado e regue com metade do molho. Faça outra camada com a abobrinha e o molho restante. Polvilhe queijo e leve ao micro-ondas até o centro ficar quente.");
                break;

            case "Macarrão com Abobrinha":
                Ingredientes.setText("- 3 abobrinhas italianas médias\n- 2 colheres (sopa) de azeite\n- 2 dentes de alho fatiados\n- 10 folhas de manjericão\n- meia colher (chá) de sal\n- 1 pitada de pimenta-do-reino (opcional)\n- 1 colher (sopa) de queijo parmesão ralado ou queijo branco ralado (opcional)");
                Preparo.setText("Com o auxílio de uma faca, fatie as abobrinhas em laminas finas, no sentido do comprimento e corte cada fatia em tiras bem finas, como um espaguete. Coloque-as aos poucos em água fervente com sal e cozinhe rapidamente (cerca de 1 minuto) apenas para que amoleça levemente. Escorra, transfira para água gelada (para interromper o cozimento) e reserve. Em uma frigideira grande aqueça o azeite e refogue o alho, sem deixar dourar. Junte o manjericão, o sal, a pimenta-do-reino e as abobrinhas reservadas e misture delicadamente, para incorporar o tempero e não partir as tiras. Transfira para um prato grande, polvilhe com o queijo ralado e sirva a seguir.");
                break;


            case "Mil folhas de Abobrinha\"":
                Ingredientes.setText("- 2 unidades de abobrinha pequena\n- 100 gramas de queijo brie\n- 30 ml de azeite de oliva\n- 100 gramas de tomate-cereja\n- 1 embalagem de creme de balsâmico frutas vermelhas");
                Preparo.setText("Cortar a abobrinha em fatias de 1 a 2 mm;Grelhar as fatias no azeite de oliva e reservar. Amornar o creme de balsâmico em uma panela, adicionar um pouco de água e os tomatinhos; aquecer por alguns segundos. Cortar o queijo brie em finas fatias. Montagem: Em um aro de metal apropriado para ir ao forno intercalar fatias de abobrinha e de queijo brie, finalizando com abobrinha. Levar ao forno por alguns minutos para aquecer. Montar em pratos individuais, retirar o aro e decorar com os tomatinhos.");
                break;



            case "Abobrinha à Milanesa":
                Ingredientes.setText("- 1 abobrinha grande\n- 2 ovos batidos\n- sal e pimenta-do-reino a gosto\n- farinha de trigo e farinha de rosca para empanar\n- óleo para fritar");
                Preparo.setText("Antes de começar a preparar esta receita, lembre-se de higienizar a sua abobrinha!Quando ela estiver bem limpa, remova as partes da casca que estão machucadas, mas apenas elas. Não é preciso descascá-la!Com uma faca bem afiada, corte a abobrinha em fatias de aproximadamente 2 dedos de largura. Acrescente sal e pimenta-do-reino a gosto. Deixe descansar por cerca de 15 minutos. Em seguida, passe cada rodela seguindo a ordem: farinha de trigo, ovos batidos, farinha de rosca. Depois passe novamente nos ovos e na farinha de rosca. Dessa forma, a sua abobrinha ficará ainda mais crocante. Uma dica para deixar a abobrinha ainda mais gostosa é temperar a farinha de rosca com pimenta-do-reino e cheiro-verde!Aqueça uma panela com óleo suficiente para fritar as abobrinhas. Coloque as rodelas no óleo quente com ajuda de uma escumadeira. Deixe dourar dos dois lados. Utilize papel-toalha para remover o excesso de óleo.");
                break;



            case "Couve Refogada Piná":
                Ingredientes.setText("- 1 cebola picada\n- 2 dentes de alho picados\n- 2 abobrinhas pequenas raladas\n- 2 xícaras de trigo para kibe\n- 3 xícaras de água fervente\n- Azeite de oliva\n- Sal\n- 1 colher de chá de pimenta síria\n- 2 xícaras de creme ricota\n- 2 xícaras de ricota\n- Folhas de hortelã a gosto\n- Salsinha picada a gosto");
                Preparo.setText("Em uma panela, colocar um fio de azeite e refogar a cebola por 3 minutos. Adicionar o alho e refogar por mais 2 minutos. Acrescentar as abobrinhas raladas e refogar por 5 minutos. Em um recipiente, colocar o trigo para kibe e adicionar a água fervente para hidratar. Em um recipiente, misturar a ricota, o creme de ricota e a hortelã. Reservar. Misturar a abobrinha refogada com o trigo hidratado. Temperar com sal, pimenta síria e salsinha. Em um refratário, fazer uma camada do trigo com abobrinha, colocar o creme de ricota e finalizar com mais uma camada de trigo com abobrinha. Levar ao forno preaquecido a 180 graus por 30 minutos ou até que esteja levemente dourado. MODO DE PREPAROLave muito bem a couve sob água corrente. Retire os talos das folhas e coloque-os em uma bacia. Cubra com uma solução de 1 litro de água para 1 colher (sopa) de água sanitária para higienizar e deixe de molho por 10 minutos. Lave bem e escorra. Empilhe uma folha sobre a outra, enrole as folhas apertando bem, como se estivesse fazendo um charuto. Coloque o charuto de couve sobre uma tábua e corte com uma faca afiada em fatias bem fininhas. Coloque em uma frigideira grande o azeite, o bacon e a lingüiça e refogue por 2 minutos. Acrescente a cebola e refogue mais 2 minutos. Junte o alho e refogue por mais 1 minuto. Coloque toda a couve picada na frigideira e refogue por mais 5 minutos, mexendo de vez em quando, com a panela tampada até a couve começar a murchar. Tempere com sal e misture bem. Sirva a seguir.");
                break;



            case "Purê de Couve":
                Ingredientes.setText("- 1 Xíc. de chá de couve picada em fatias finas\n- 1 Xíc. de chá de leite líquido desnatado\n- 1/2 cebola picada\n- 1 Col. de Sobremesa Amido de Milho\n- 1 Col. de Sobremesa azeite de oliva\n- 1 dente de alho picado\n- 1 Col. de Sopa de requeijão light\n- Sal a gosto\n- Pimenta do reino a gosto");
                Preparo.setText("Coloque o azeite de oliva em uma panela antiaderente e refogue a cebola, depois o alho. Então coloque a couve e deixe refogar por mais 2 minutos. Coloque o leite de milho no leite e mexa até ficar dissolvido. Então bata o leite com o leite e o refogado no liquidificador até que fique bem homogêneo. Volte ou defina para uma panela e fogo baixo, apure até que engrosse. Acrescente o requeijão e os temperos, mexa bem e então está pronto.");
                break;



            case "Caldo Verde Vegetariano":
                Ingredientes.setText("- 1/2 kg de batata\n- 1 1/2 l de água\n- 4 dentes de alho\n- 1 cubo de caldo de legumes\n- 5 folhas de couve fatiada fina\n- Azeite\n- Pimenta do reino e sal a gosto");
                Preparo.setText("Em uma panela de pressão cozinhe as batatas com a água, dois dos dentes de alho e o caldo de legumes. Deixe cozinhar por uns 10 minutos. Quando começar a chiar desligue o fogo. Enquanto isso, refogue a couve com os outros 2 dentes de alho amassados e o azeite. Salgue a couve. Bata no liqüidificador o cozido de batatas, e leve para ferver. Junte a couve a sopa. Acrescente sal a gosto.");
                break;



            case "Creme de Folha de Couve":
                Ingredientes.setText("- 3 folhas de couve bem picadas\n- 1/2 cebola picada\n- 1 xícara (chá) de leite\n- 1 xícara (chá) de água\n- 1 colher de farinha de trigo\n- 2 colheres (sopa) de queijo parmesão ralado\n- Sal a gosto\n- 2 colheres de azeite");
                Preparo.setText("Refogue no azeite a cebola e as folhas picadas até que a cebola fique transparente. Em outra frigideira junte o leite, a água, a farinha de trigo e o queijo ralado, mexa bem até que vire um creme bem encorpado. Junte em seguida ainda com o fogo ligado, o refogado e continue mexendo por mais 2 minutos. Servir em seguida sobre saladas, carnes ou aves, como preferir.");
                break;


            case "Suco de Couve com Limão":
                Ingredientes.setText("- Couve\n- 1 limão\n- água\n- Açúcar");
                Preparo.setText("Bata a couve, com a quantidade de água que quiser. Depois côe o suco em uma jarra , espreme o limão, adoçe e beba.");
                break;

            case "Cuscuz de Frango e Couve":
                Ingredientes.setText("");
                Preparo.setText("");
                break;


            case "Creme de Feijão com Couve e Alho-Poró":
                Ingredientes.setText("");
                Preparo.setText("");
                break;


            case "Gratinado de Couve Manteiga e Nozes":
                Ingredientes.setText("");
                Preparo.setText("");
                break;


            case "Quiche de Couve":
                Ingredientes.setText("");
                Preparo.setText("");
                break;


            case "Trouxinha de Alface (Embrulhadinho Veloz)":
                Ingredientes.setText("- 1 xícara (chá) de queijo branco em cubos bem pequenos\n- 1 tomate grande, sem sementes, em cubos bem pequenos\n- 1 pitada de orégano\n- meia colher (chá) de azeite\n- 1 pitada de sal\n- 1 colher (sopa) de requeijão \n- 6 folhas de alface lisa");
                Preparo.setText("Em um recipiente misture o queijo branco, o tomate, o orégano, o azeite, o sal e o requeijão. Coloque 1 porção desta mistura no centro de uma folha de alface e feche as pontas, formando uma trouxinha. A trouxinha pode ser amarrada com cebolinha verde, para permanecer fechada, ou ainda ser fechada com um palito colorido");
                break;

            case "Rolinho de Alface Fácil":
                Ingredientes.setText("- 6 folhas de alface lisa\n- 6 fatias de queijo prato\n- 6 fatias de presunto magro\n- 1 unidade de cenoura pequena ralada\n- Molho:\n- 2 colheres (sopa) de azeite de oliva\n- 1 colher (sopa) de água\n- 1 colher (sopa) de mostarda\n- 1 colher (sobremesa) de suco de limão\n- sal e orégano a gosto");
                Preparo.setText("Sobre cada folha de alface coloque uma fatia de queijo e uma de presunto. Distribua a cenoura e enrole, prendendo com palitos. Acomode os rolinhos em uma saladeira. Misture os ingredientes do molho e regue os rolinhos ou sirva à parte. Molho: Misture todos os ingredientes e reserve.");
                break;


            case "Salada Leve":
                Ingredientes.setText("- folhas de meio pé de alface-crespa rasgadas\n- 300 g de tomates-cereja cortados ao meio\n- 200 g de queijo muçarela, em cubos\n- 1 cenoura pequena ralada\n- \n- Molho:\n- \n- 2 colheres (sopa) de azeite de oliva\n- 3 colheres (sopa) de água\n- 1 colher (sopa) de linhaça triturada\n- 1 pitada de sal");
                Preparo.setText("Forre o fundo de uma travessa com a alface e, por cima, disponha o tomate, o queijo e a cenoura. Prepare o molho: em uma tigela pequena, coloque o azeite, a água, a linhaça, e o sal, e misture bem. Sirva a salada com o molho à parte.");
                break;

            case "Salada caesar com alface romana e couve":
                Ingredientes.setText("- 1 filão pequeno (ou metade de um grande) de pão rústico amanhecido\n- 340g a 450g de brotinhos do meio do pé de couve e da alface romana, em quantidades iguais\n- 1 dente de alho grande ou 2 pequenos\n- 4 a 6 filés de anchova\n- 1 colher (chá) de mostarda dijon\n- Sal e pimenta-do-reino moída na hora\n- 1/2 xícara de azeite de oliva extra virgem\n- 2 colheres (sopa) de suco de limão\n- 1 ovo\n- 113 g de parmesão ralado na hora, mais um bom pedaço para servir");
                Preparo.setText("Faça os croutons: aqueça o forno a 200°C. Parta com as mãos, em pedaços pequenos, a parte da macia do centro do pão, desprezando a casca. Deve dar mais ou menos 3 xícaras. Espalhe tudo sobre uma forma e leve a assar até ficar dourado e crocante (12 min). Deixe esfriar. Prepare a couve: com uma faca pequena e afiada, corte uma folha por vez, tirando a nervura mais grossa da parte central, que deve ser descartada. Depois de repetir o procedimento com todas, vá rasgando em pedaços pequenos. Prepare a alface: rasgue as folhas ao meio e depois, em partes menores. Deixe as menores, do meio, inteiras. Encha a pia ou uma tigela com água bem gelada e coloque aí as folhas. Deixe descansar de 5 a 10 min. Vá retirando aos poucos, seque com um pano de prato e coloque na centrífuga para retirar o excesso de água. Coloque um saco plástico cheio de gelo no fundo da tigela; disponhas as folhas por cima, cubra com um pano de prato úmido e refrigere até a hora de servir. No liquidificador, bata o alho, as anchovas, a mostarda, uma pitada generosa de sal, um bom punhado de pimenta moída, azeite e suco de limão. Bata até obter um creme homogêneo. Cozinhe o ovo até a gema endurecer um pouco, mas continua mole no centro. Acrescente ao molho e volte a bater. Prove e ajuste os temperos de acordo com seu gosto. Deve ficar forte e marcante, mas não ácido. Bata mais um pouco, coloque em um recipiente com tampa e leve à geladeira até a hora de usar. Pouco antes de servir, retire o pano e o gelo da tigela e dê uma reavivada nas folhas. Dê uma misturada no molho. Sobre as folhas, coloque metade dos croutons, metade do molho e metade do queijo. Misture bem. Acrescente o resto dos ingredientes e ajuste o tempero, se necessário. Polvilhe o resto do parmesão e, se quiser, moa mais um pouquinho de pimenta. Sirva imediatamente. Mexa mais uma vez à mesa.");
                break;

            case "Salada de alface americano e abacate":
                Ingredientes.setText("- 7 folhas de alface americana\n- 1 tomate\n- 1 cebola pequena\n- 1 abacate pequeno\n- Molho\n- 1/5 suco de limão\n- 1 colher de sopa de maionese light\n- Sal e pimenta a gosto");
                Preparo.setText("Lava e prepara os vegetais e separa as folhas de alface. Cortar em cubos o tomate, a cebola e o abacate e misture com os vegetais. MolhoEm um refratário, Junte o azeite, o suco de limão, a maionese, uma pitada de sal e pimenta, mexe tudo até formar um molho cremoso. Por fim acrescente o molho por cima dos vegetais envolvendo tudo.");
                break;

            case "Panqueca de Alface":
                Ingredientes.setText("- ½ maço de alface-romana (10 folhas)\n- ⅔ de xícara (chá) de coentro (½ maço)\n- ¾ de xícara (chá) de salsinha (½ maço)\n- ⅓ de xícara (chá) de endro (dill) (½ maço)\n- 2 ovos\n- 2 dentes de alho\n- 3 colheres (sopa) de farinha de trigo\n- ½ colher (chá) de açúcar\n- ½ colher (chá) de sal\n- noz-moscada ralada na hora a gosto\n- pimenta-do-reino moída na hora a gosto\n- azeite a gosto");
                Preparo.setText("Faça o pré-preparo: lave as folhas de alface sob água corrente, transfira para uma centrífuga de saladas e seque bem. Coloque uma folha de alface sobre a outra e corte em fatias grossas - isso facilita na hora de bater a massa. Descarte a base grossa dos talos das ervas, lave e seque as folhas. Descasque os dentes de alho. Numa tigela, quebre um ovo de cada vez e transfira para o processador. Junte a alface, as ervas, os dentes de alho e bata até triturar bem. Acrescente a farinha de trigo, o açúcar, tempere com ½ colher (chá) de sal, noz-moscada e pimenta a gosto. Bata até formar uma massa líquida e transfira para uma tigela. Leve uma frigideira grande (de preferência antiaderente) ao fogo médio. Quando aquecer, regue com ½ colher (sopa) de azeite e prepare as panquecas: com uma concha pequena, misture delicadamente a massa e transfira uma porção para a frigideira, formando um disco pequeno – coloque quantas panquecas couberem uma ao lado da outra. Deixe dourar por 2 minutos, até soltar da frigideira – as bordas da panqueca começam a firmar mas o centro ainda está mole. Vire com uma espátula, abaixe o fogo e deixe dourar do outro lado. Transfira a primeira leva de panquecas para um prato, regue a frigideira com um fio de azeite e repita com o restante, sempre misturando a massa da panqueca com a concha antes de levar à frigideira. Sirva a seguir com queijo cottage caseiro, salada de feijão-branco com pepino e rabaneteou uma saladinha de ervas.Faça o pré-preparo: lave as folhas de alface sob água corrente, transfira para uma centrífuga de saladas e seque bem. Coloque uma folha de alface sobre a outra e corte em fatias grossas - isso facilita na hora de bater a massa. Descarte a base grossa dos talos das ervas, lave e seque as folhas. Descasque os dentes de alho. Numa tigela, quebre um ovo de cada vez e transfira para o processador. Junte a alface, as ervas, os dentes de alho e bata até triturar bem. Acrescente a farinha de trigo, o açúcar, tempere com ½ colher (chá) de sal, noz-moscada e pimenta a gosto. Bata até formar uma massa líquida e transfira para uma tigela. Leve uma frigideira grande (de preferência antiaderente) ao fogo médio. Quando aquecer, regue com ½ colher (sopa) de azeite e prepare as panquecas: com uma concha pequena, misture delicadamente a massa e transfira uma porção para a frigideira, formando um disco pequeno – coloque quantas panquecas couberem uma ao lado da outra. Deixe dourar por 2 minutos, até soltar da frigideira – as bordas da panqueca começam a firmar mas o centro ainda está mole. Vire com uma espátula, abaixe o fogo e deixe dourar do outro lado. Transfira a primeira leva de panquecas para um prato, regue a frigideira com um fio de azeite e repita com o restante, sempre misturando a massa da panqueca com a concha antes de levar à frigideira. Sirva a seguir com queijo cottage caseiro, salada de feijão-branco com pepino e rabaneteou uma saladinha de ervas.");
                break;

            case "Salada Primavera":
                Ingredientes.setText("- 1/2 kg de morango\n- 1 pé pequeno de alface americana\n- 1 xícara (chá) de cogumelos frescos fatiados\n- 3 colheres (sopa) de cebolinha picada\n- 4 colheres (sopa) de amêndoas torradas em lascas\n- Molho:\n- 1 colher (sopa) de vinagre de maçã\n- 1 colher (chá) de mel\n- 1 colher (chá) de Fondor MAGGI\n- 1 colher (sopa) de azeite\n- 1 colher (chá) de sementes de papoula");
                Preparo.setText("Limpe os morangos e corte-os em quatroReserve 1/2 xícara (chá) para o preparo do molhoLave a alface, deixe secar um pouco e corte-a em tiras finasAfervente rapidamente os cogumelos, escorra e reserveEm uma saladeira ou em pratos individuais, disponha a alface, os morangos, os cogumelos, a cebolinha e as amêndoasÀ parte, amasse com um garfo o morango reservado e acrescente os ingredientes do molhoRegue a salada com o molho e sirva");
                break;


            case "Salada Grega":
                Ingredientes.setText("- 1 alface baby\n- 2 punhados de rúcula selvática ou Espinafre europeu\n- ½ xícara (chá) de tomatinhos cereja ou sweet partidos ao meio.\n- ½ xícara (chá) de fatias ou cubinhos de pepino japonês\n- ¼ de chancliche branco\n- 8 azeitonas pretas.\n- ½ cebola roxa em lâminas\n- ¼ de xícara (chá) de folhas de hortelã.\n- INGREDIENTES DO MOLHO:\n- 3 colheres (sopa) de azeite de oliva.\n- 1 colher (sobremesa) de suco de limão.\n- Sal e pimenta do reino à gosto.");
                Preparo.setText("Em um bowl dissolva o sal no suco de limao, acrescente o azeite em fio misturando sem parar até obter um molho encorpado. Ajuste o sal. Reserve duas colheres em um potinho.  Incorpore os tomatinhos, pepinos, cebola e azeitonas ao bowl e misture bem com o restante da vinagrete. Disponha em uma travessa.  Sobre a mistura de pepino e tomates disponha a alface o a rúcula, misturados com as folhas de hortelã. Regue com a vinagrete reservada.  Polvilhe toda a salada com o chancliche esfarelado.");
                break;



            case "Salada Cassar":
                Ingredientes.setText("- ½ xícara de maionese\n- ⅓ de xícara de parmesão ralado + lascas para decorar\n- suco de 1 limão\n- 2 colheres de sopa de azeite de oliva + azeite de oliva a gosto\n- 1 filé de anchova em conserva\n- 2 dentes de alho\n- 2 fatias de pão de torta fria\n- 2 filés de peito de frango\n- sal a gosto\n- pimenta do reino a gosto\n- 1 maço de alface americana");
                Preparo.setText("No liquidificador, bater a maionese, o parmesão ralado, o suco de limão, 2 colheres de sopa de azeite de oliva, o filé de anchova e 2 dentes de alho. Reservar na refrigeração. Cortar o pão de torta fria em cubinhos, regar com azeite de oliva e levar ao forno 180 graus por 15 minutos ou até ficarem dourados e crocantes. Reservar. Em uma frigideira quente, selar as iscas em azeite até ficarem douradas e temperar com sal e pimenta. Reservar para esfriar. Cortar as folhas de alface americana com a mão e dispor em uma saladeira. Acomodar as iscas de frango, despejar o molho, misturar, finalizar com os croutons e com as lascas de parmesão.");
                break;


            case "Salada de Alface com Laranja":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Salada de Alface e Tomate com Pepino e Queijo":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Salada de Alface com Frutas":
                Ingredientes.setText("");
                Preparo.setText("");
                break;


            case "Salada de Alface e Tomate com Molho Italiano":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Salada de Alface com figo e Gorgonzola":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Quiabo sem Baba com Molho Delicioso":
                Ingredientes.setText("- 200 gramas de quiabo\n- 1 dente de alho picado\n- ½ cebola picada\n- ½ limão (suco)\n- 1 tomate pequeno picado\n- 4 colheres de sopa de molho de tomate\n- 1 colher de sopa de vinagre\n- sal e pimenta do reino a gosto\n- salsinha para finalizar");
                Preparo.setText("Para o primeiro passo, é importante a escolha dos quiabos. Dê preferência aos menores, pois assim não correrá o risco de comprar quiabos duros. Tire as duas pontas dos quiabos e pique-os. Em uma panela frite o alho até ficar bem dourado e adicione o quiabo picado. Refogue por cerca de 5 minutos e coloque o suco do limão (isso ajudará a tirar a baba). O passo seguinte desta receita de quiabo refogado com molho é adicionar a cebola e o tomate picados e refogar por mais alguns minutos. Coloque o molho de tomate, cubra com água, adicione o vinagre (que também ajudará tirar a baba) e tempere com o sal e a pimenta do reino. Deixe ferver em fogo baixo até que o molho fique incorporado. Finalize com a salsinha picada e está pronto seu quiabo ao molho, uma maneira diferente de preparar quiabo e muito gostosa!");
                break;

            case "Quiabo com Linguinça":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Arroz 7 Grãos com Quiabo e Frango Desfiado":
                Ingredientes.setText(" ");
                Preparo.setText(" ");
                break;

            case "Salada de Quiabo":
                Ingredientes.setText("- 1/2 kg de quiabo\n- 5 colheres (sopa) de suco de limão\n- 1 cebola\n- 1 tomate\n- 1 pimentão vermelho\n- 1 colher (sopa) de gergelim\n- 1 colher (sopa) de salsa (ou salsinha) picada\n- 2 colheres (sopa) de azeite de oliva\n- sal a gosto\n- pimenta-do-reino a gosto");
                Preparo.setText("Limpe os quiabos, cortando apenas a pontinha superior. Mergulhe-os inteiros em água fervente com 2 colheres (sopa) de suco de limão e sal. Deixe-os imersos por uns 8 minutos e escorra. Corte-os então em pedaços menores. Divida a cebola e o tomate em rodelas. Limpe o pimentão e pique-o em tirinhas. Arrume todos esse ingredientes em uma travessa. Para o molho, misture 3 colheres (sopa) de suco de limão com 2 colheres (sopa) de azeite, sal e pimenta-do-reino. Pingue sobre a salada e salpique, por fim, a salsa e o gergelim.");
                break;


            case "Quabo e Grão de Bico Assados":
                Ingredientes.setText("- 450g de quiabo\n- 1 colher de sopa de óleo vegetal\n- 1 lata de 400g de grão-de-bico drenado\n- 2 colheres de chá de garam masala ou outro tipo de curry em pó\n- Sal Kosher e pimenta-do-reino moída na hora");
                Preparo.setText("Preaqueça o forno a 220°C. Retire os topos dos quiabos, que geralmente ficam marrons. Depois, corte-os na diagonal em pedaços de 3cm e coloque-os numa assadeira. Misture com o óleo. Seque os grãos-de-bico no papel toalha e coloque-os na assadeira. Em uma tigela, misture o garam masala com ½ colher de chá de sal e ½ colher de chá de pimenta. Polvilhe a mistura sobre o quiabo e o grão-de-bico e misture até que todos os vegetais estejam cobertos. Espalhe os ingredientes em uma só camada e asse até o quiabo ficar macio quando perfurado com a ponta de uma faca e os grãos-debico estejam crocantes, por 25 a 30 minutos. Acerte o sal. Mexa e sirva enquanto estiver quente.");
                break;

            case "Farofa de Quiabo":
                Ingredientes.setText("- 1/2 kg de quiabos\n- 1/2 kg de farinha de milho em flocos\n- 1 cebola grande\n- 1 dente de alho amassado\n- 2 colheres de sopa de óleo\n- 1/2 xícara de cheiro verde fresco picado\n- Sal e pimento de reino a gosto");
                Preparo.setText("Lave os quiabos, corte em pedaços de 2 cm, coloque de molho em uma bacia com água e vinagre por uns 15 minutos. Enxágue e escorra bem. Em uma panela, refogue o alho e a cebola no óleo, junte o quiabo e refogue até ficar al dente. e junte a farinha de milho aos poucos, mexendo até misturar bem. Quando der o ponto,e coloque o sal e a pimento do reino, desligue o fogo e junte o cheiro verde, misture e sirva a seguir. Fica maravilhosa como acompanhamento para frango assado ou ao molho.");
                break;

                case "Salada de Quiabo com Ricota":
                Ingredientes.setText("- 200 gramas de quiabo;\n- 1 pimentão amarelo;\n- 1 cebola média;\n- 50 gramas de azeitonas pretas em lascas;\n- 150 gramas de ricota fresca;\n- 3 colheres de sopa de vinagre;\n- 3 colheres de sopa de azeite;\n- suco de ½ limão;\n- sal a gosto.");
                Preparo.setText("Lave bem o quiabo, corte as duas pontas e despreze. Deixe o quiabo de molho em uma solução com suco de limão por uns 5 minutos. Escorra e leve para cozinhar numa panela com água e sal por 10 minutos. Escorra, deixe esfriar e depois corte em rodelas. Corte a cebola em rodelas, ferva, escorra e reserve. Esfarele a ricota e reserve. Asse o pimentão no forno alto por 10 minutos. Retire a pele, as sementes e corte em rodelas. Reserve. Quando todo pré-prearo estiver pronto. Basta misturar todos os ingredientes numa saladeira, colocar as azeitonas e temperar com vinagre azeite e sal a gosto. Sirva.");
                break;

            case "Bruschetta de Tomate":
                Ingredientes.setText("- 4 xícaras de tomate cereja, heirloom ou normal\n- 3-4 dentes de alho, amassados ligeiramente ou inteiros\n- 2 colheres de sopa de azeite de oliva\n- Um pouco de folhas de manjericão fresco ou 2 colheres de chá de manjericão em pó\n- Sal a gosto\n- Para servir:\n- Fatias de pão, tostadas e esfregadas com alho e manjericão fresco/tomilho para enfeitar");
                Preparo.setText("Corte os tomates ao meio ou em quatro, dependendo do tamanho. Misture os tomates cortados, os dentes de alho, o azeite de oliva, o manjericão e o sal em uma tigela. Cubra e deixe na geladeira por pelo menos 2 horas, da noite para o dia é o ideal. Remova as folhas de manjericão e os dentes de alho. Sirva em cima de uma fatia de pão tostado, que foi esfregado no alho. Enfeite com folhas frescas de manjericão ou tomilho.");
                break;

            case "Tomate Recheado":
                Ingredientes.setText("- 6 tomates maduros\n- 1/2 colher de chá de sal\n- 6 dentes de alhos fatiados\n- 3 colheres sopa de azeite\n- 2 xícaras e meia de chá de pão italiano em cubos\n- 1 xícara de chá de queijo parmesão ralado\n- 1 colher de chá de orégano");
                Preparo.setText("Corte uma tampa dos tomates e deixe o interior oco. Polvilhe o sal dentro e escorra. Doure o alho em 1 colher sopa de azeite. Retire e reserve. Na mesma frigideira, frite o pão. Transfira para uma vasilha e misture o queijo, o orégano, e o alho reservado. Recheie os tomates, e regue com 1 colher e meia de sopa de azeite. Coloque em uma assadeira untada com o resto do azeite e asse por 15 minutos.");
                break;

            case "Tomate Seco Caseiro":
                Ingredientes.setText("- 3 kg de tomate\n- 1 colher (sopa) de sal\n- 1/2 xícara de açúcar\n- vinagre\n- Tempero\n- 1 xícara de azeite\n- 6 dentes de alho espremidos\n- 1 colher (sobremesa) de sal\n- 1 colher (sobremesa) de orégano\n- folhas de louro\n- pimenta a gosto");
                Preparo.setText("Corte os tomates ao meio e tire as sementes. Coloque uma colher de café de vinagre em cada tomate cortado. Também coloque sal e açúcar. Coloque os tomates no micro-ondas com a pele para baixo em refratário grande por 25 minutos. A cada 5 minutos, tire o excesso de água dos tomates, vire-os e deixe de 10 a 15 minutos (potência alta) ou até parar de sair água. Não coloque todos os tomates de uma só vez. Após isso, leve os tomates ao forno convencional a 200° C por 30 minutos ou até que a pele fique um pouco seca. O tempo varia de acordo com cada forno. Fique de olho para que eles não queimem!Desligue o forno e deixe que os tomates esfriem lá dentro. Temperar com alho picadinho, folhas de louro, pimenta e azeite. Misture bem e coloque em vidros bem limpos, de preferência lavados com água fervente (cuidado para não se queimar!). Complete com azeite até o topo.");
                break;

            case "Salada de Tomate Cereja com Queijo e Maçã":
                Ingredientes.setText("- 2 xícaras de tomate cereja cortados ao meio\n- 1 xícara de queijo minas frescal light cortado em cubos\n- 1 maçã pequena com casca picada em cubos\n- cheiro-verde picado a gosto\n- suco de 1 limão\n- azeite de oliva a gosto\n- sal a gosto");
                Preparo.setText("Misturar os tomates e a maçã. Colocar os temperos, o queijo frescal e o cheiro verde. Misturar delicadamente.");
                break;


            case "Salada Carpaccio de Tomate":
                Ingredientes.setText("- 2 gemas de ovos (extra grandes), à temperatura ambiente\n- 2 colheres de chá de mostarda Dijon, à temperatura ambiente\n- 1 colher de sopa de alho picado (3 dentes)\n- 2 filés de anchova; escorra todo o líquido\n- 1/2 xícara de suco de limão-siciliano espremido na hora, à temperatura ambiente (2 a 3 limões)\n- Sal kosher e pimenta-do-reino, moída na hora\n- 3/4 de xícara de azeite de oliva, de boa qualidade\n- 1/4 de xícara de óleo de canola\n- 1/2 xícara de queijo parmesão, ralado na hora (recomendado: queijo Parmesão Italiano)\n- 4 a 5 tomates vermelhos grandes e firmes, porém maduros (recomendado: tomate heirloom)\n- 1/2 colher de chá de flor de sal\n- 2 colheres de sopa de alcaparras; se estiver na salmoura escorra\n- 1/4 de folhas frescas de manjericão, cortadas à juliana\n- Um pedaço de 60g de queijo Parmesão Italiano; em lascas");
                Preparo.setText("Em um processador de alimentos, usando uma lâmina de aço, coloque as gemas, a mostarda, o alho, as anchovas, o suco de limão, 2 1/2 colheres de chá de sal, 1 colher de chá de pimenta e processe por 15 segundos. Em um copo de medidas de vidro, coloque o óleo e o azeite. Com o processador de alimentos funcionando, despeje lentamente a mistura de óleos em um fluxo fino e contínuo no tubo de alimentação; faça da mesma forma que você faria uma maionese. Adicione o parmesão ralado e processe novamente para combinar. Você ficará com um molho fino o suficiente para regar os tomates. Despeje bastante molho no meio de cada um dos 4 pratos. Retire as sementes dos tomates e corte-os em fatias com cerca de 1cm de espessura (no sentido transversal); use uma faca serrilhada. Arrume as fatias de tomate sobrepostas nos pratos, de uma forma decorativa. Polvilhe com a flor de sal e, usando uma colher de sopa, regue com um pouco mais de molho por cima dos tomates. Polvilhe com as alcaparras, o manjericão, o queijo parmesão e a pimenta. Sirva à temperatura ambiente com uma pequena tigela de molho extra, como acompanhamento.");
                break;

            case "Pasta de Tomate":
                Ingredientes.setText("- 1 colher (sopa) de azeite de oliva (15 ml)\n- 1 cebola pequena picada (120 g)\n- 1 dente de alho picadinho\n- 4 tomates maduros sem pele e sem sementes (500 g) ou 1 lata de tomate pelato (400 g) ou 1 e ¼ de xícara (chá) de molho pronto de tomate (300 g)\n- 1 folha de louro\n- 2 fatias de pão de fôrma sem casca ou ½ pão francês\n- 1/2 xícara (chá) de leite (120 ml)\n- 1 gema\n- ¼ de xícara (chá) de queijo parmesão ralado (25 g)\n- 2 colheres (sopa) de salsinha picadinha (2 ramos)\n- Sal\n- Pimenta-do-reino");
                Preparo.setText("Numa frigideira grande, aqueça o azeite, doure ligeiramente a cebola e junte o alho. Quando perfumar, acrescente o tomate (ou o molho pronto), o louro, sal, pimenta e deixe ferver por uns 10min pra apurar e ganhar sabor (se estiver utilizando molho pronto, simplesmente espere ferver e retire do fogo). Enquanto isso, coloque o pão numa tigela, cubra com o leite e deixe descansar por 5min. Bata no liquidificador o refogado de tomate com o louro, a mistura de pão e a gemas até obter um creme homogêneo. Volte com tudo pra frigideira e pro fogo e, sempre mexendo, deixe ferver e engrossar. Junte o parmesão e a salsinha, acerte o sal e a pimenta e retire do fogo. Sirva a pasta quente ou morna, ou guarde a pasta na geladeira por até 3 dias e sirva gelada.");
                break;

            case "Risoto de Tomate Seco e Rúcula":
                Ingredientes.setText("- 2 copos de arroz arbóreo\n- 1 maço de rúcula\n- 250g de tomate seco\n- 3 dentes de alho picados\n- Azeite a vontade\n- 2 caldos de galinha dissolvidos em bastante água (ou temperos de sua preferência)\n- 250 g de queijo mussarela ralada\n- 1 copo de vinho branco seco");
                Preparo.setText("Primeiro coloque a água para ferver junto com o caldo de galinha. Deixe sempre fervendo em fogo bem baixinho. Em um panela frite o alho no azeite e acrescente o arroz. Deixe fritar bem e acrescente o vinho. Mexa até secar bem. Acrescente o tomate seco. Acrescente uma concha do caldo, mexa um pouco e deixe secar. Quando estiver secando, acrescente outra. Repita a operação várias vezes, e mexa de vez em quando para não grudar. Quando verificar que o arroz está al dente, desligue o fogo, coloque toda a rúcula picada e mexa bem. Procure deixar bem molhado nesse final. Depois acrescente o queijo ralado, misture bem e mistura mais 2 colheres de azeite. Sirva como prato único.");
                break;

            case "Salada de Tomate ao Curry":
                Ingredientes.setText("- 2 colheres (sopa) de CURRY \n- 5 tomates maduros cortados em 4 partes\n- ½ pimentão vermelho em cubos grandes\n- 1 cebola descascada cortada em 4 partes\n- 2 dentes de alho descascados\n- ½ xícara (chá) de azeite\n- sal e pimenta do reino moída a gosto\n- 1 xícara (chá) de água fervente\n- parmesão a gosto para servir\n- pão italiano para servir");
                Preparo.setText("Pré-aqueça o forno a 180 graus. Use uma assadeira média e adicione os tomates, o pimentão, a cebola e o alho. Regue com azeite e tempere o CURRY e sal. Leve ao forno por 20 minutos até que os legumes estejam macios e levemente tostados. Transfira os legumes assados para o liquidificador e adicione água fervente. Tampe e bata até a sopa ficar lisa e cremosa. Sirva a seguir com lascas de parmesão e pão italiano para acompanhar.");
                break;

                case "Tomate Assado":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Molho de Tomate":
                Ingredientes.setText("");
                Preparo.setText("");
                break;


            case "Sopa de Tomate":
                Ingredientes.setText("");
                Preparo.setText("");
                break;


            case "Salada Caprese no Tomate":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Tomate com Ovo":
                Ingredientes.setText("");
                Preparo.setText("");
                break;


            case "Risoto de Tomate Seco com Rúcula":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Patê de Ricota com Tomate Seco":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Bolo de Abacate":
                Ingredientes.setText("- 2 e 1/4 xícaras de farinha de trigo \n- 1 xícara de açúcar cristal\n- 1/2 xícara de óleo vegetal\n- 1 colher de sopa de essência de baunilha\n- 1 colher de sopa de vinagre branco\n- 1 colher de café de bicarbonato de sódio\n- 1 colher de sopa de fermento em pó\n- 1 xícara de água na temperatura ambiente\n- 1/3 xícara de polpa de abacate bem maduro\n- caldo de 1/2 limão pequeno\n- 1 pitada de sal");
                Preparo.setText("Retire a polpa do abacate e amasse com um garfo adicionando o caldo do limão. Reserve. Não é necessário bater. (Faça este bolo a mão). Misture bem a farinha com o açúcar e o bicarbonato. Acrescente a água aos poucos alternando com o óleo. Adicione o vinagre e a baunilha. Depois acrescente o abacate preparado antes e misture delicadamente. Por último adicione o fermento misturando delicadamente sem bater. Unte uma forma, coloque a massa e leve para assar em forno pré-aquecido em temperatura media de 180C por 30 a 40 minutos ou até que esteja dourado.");
                break;

            case "Sorvete de Abacate":
                Ingredientes.setText("- 1 abacate maduro\n- 1 colher de chá de extrato de baunilha\n- 2 colheres de sopa de açúcar\n- 1 xícara de leite desnatado");
                Preparo.setText("Em um copo, misture o leite, açúcar e baunilha. Coloque no liquidificador junto com o abacate e bata até ficar um creme consistente. Transfira para uma tigela e leve ao congelador por 4h. Ao completar 3h no congelador, retire e misture um pouco com uma colher. (Não deixe de fazer este passo, pois ajuda a dar a consistência). Volte ao congelador para completar o restante do tempo, retire, misture e sirva em seguida. Ele deve ser consumido neste momento, não retorne ao congelador caso contrário perderá consistência e sabor, podendo amargar. Rende uma tigela pequena.");
                break;

                case "Sopa de Abacate e Tomate":
                Ingredientes.setText("- 4 tomates grandes bem maduros (de preferência orgânicos)\n- 1 abacate pequeno bem maduro\n- 1 dente de alho pequeno\n- sal e pimenta a gosto\n- cebolinha verde picada\n- um fiozinho de azeite de oliva extra virgem\n- 1 colher de sopa de suco de limão\n- salsinha picada para decorar\n- 1 xícara de água filtrada");
                Preparo.setText("Se usar tomates orgânicos pode mantenha a pele e sementes. Caso contrário, remova a pele e corte em pedaços grandes. Coloque os tomates e o alho no liquidificador e bata bem. Adicione o sal e pimenta a gosto e uma pequena porção de cebolinha verde picada (1 colher de sopa). Bata novamente. Coloque água aos poucos e continue batendo. Acrescente o abacate e o limão e bata de novamente. Regule a cremosidade da sopa conforme a quantidade de água que acrescentar. Bata em velocidade máxima por uns 3 minutos. Por último acrescente um fiozinho de azeite de oliva extra virgem, leve ao fogo para esquentar. Sirva imediatamente com ervas frescas.");
                break;

            case "Guacamole":
                Ingredientes.setText("- ½ cebola roxa picadinha\n- ½ pimenta dedo-de-moça picadinha\n- Azeite de oliva e sal a gosto\n- Licor ou suco de laranja");
                Preparo.setText("Misture o abacate com a cebola e a pimenta. Tempere com azeite e sal a gosto e incorpore o licor ou suco de laranja. Sirva acompanhado de tacos, nachos ou salgadinhos de milho.");
                break;

            case "Macarrão com molho de abacate":
                Ingredientes.setText("- 250 g de macarrão (usei macarrão de arroz, sem glúten)\n- 1 a 2 dentes de alho\n- ¼ de xícara de manjericão fresco, mais extra para servir\n- 1 a 2 colheres de sopa de suco de limão fresco\n- 1 colher de sopa de azeite, mais se necessário\n- 1 abacate maduro, sem caroço\n- 1 colher de sopa de água\n- Sal a gosto\n- Pimenta-do-reino, a gosto\n- Raspa de limão, para servir");
                Preparo.setText("Aqueça uma panela com água e sal. Cozinhe a massa escolhida de acordo com as instruções do pacote. Enquanto isso, faça o molho: bata no processador o alho e o manjericão até ficarem picadinhos. Adicione o suco de limão, azeite, abacate e uma colher de água. Processe até virar um creme. Se estiver muito grosso, adicione mais azeite. Tempere com sal e pimenta a gosto. Escorra massa e volte para panela sem a água. Despeje por cima o molho de abacate e mexa para misturar bem. Se precisar, reaqueça a massa e sirva. Salpique pimenta, raspas de limão e folhas de manjericão, se desejar.");
                break;

            case "Vitamina de Abacate":
                Ingredientes.setText("");
                Preparo.setText("");
                break;


            case "Salada de Abacate":
                Ingredientes.setText("");
                Preparo.setText("");

                break;

                case "Nhoque de Abacate":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Pudim de Coco Verde":
                Ingredientes.setText("- 5 cocos verde (carne do coco bem mole)\n- 1 lata de leite condensado\n- 1 lata água de coco verde (mesma medida leite condensado)\n- 1 caixinha de creme de leite\n- 3 ovos\n- calda\n- 1 xícara de açúcar\n- 1/2 de xícara de água");
                Preparo.setText("Coloque a forma de pudim para caramelizar no fogo com a água e o açúcar deixe fica dourado, no liquidificador bata o coco verde com leite condensado, água de coco, creme de leite e os ovos bata por 3 a 5 minutos, depois coloque na forma já caramelizada e leve ao forno em banho Maria por cerca de 1hora a uma hora e meia. Depois de esfriar leve a geladeira por 2h e serva com algumas raspas de coco");
                break;

            case "Queijo de Coco Verde (Para Sobremesas)":
                Ingredientes.setText("- 500 gramas de coco fresco ralado (pode ser fresco congelado)\n- 500 gramas de leite integral \n- 15 gramas de açúcar refinado\n- 80 gramas de iogurte natural em temperatura ambiente");
                Preparo.setText("Numa panela, misture o coco e o leite e leve ao fogo até ferver. Ferva por dois minutos, tampe e deixe no fogo mínimo por mais 30 minutos. Retire do fogo, mantenha tampado por mais 10 minutos. Passe a mistura por um chinois, (peneira de aço) espremendo bem, ainda quente. Dissolva o açúcar no leite. Quando o leite chegar a 43 graus C, misture o iogurte. Tampe num pote de vidro, deixe em lugar quente para que a mistura mantenha uma temperatura entre 34 graus C e 48 graus C, não mais que isso. Pode ser um banho-maria ou uma iogurteira. Depois de aproximadamente 6 horas, quando a mistura tiver uma aparência pastosa, coloque para escorrer numa queijeira ou peneira em ambiente refrigerado. Esse processo leva de 6 a 8 horas e depois estará pronto.");
                break;

            case "Farofa de Coco Verde":
                Ingredientes.setText("- 1 xícara (chá) da “carne” de coco verde picado.\n- 1 ½ xícara (chá) de farinha de mandioca flocada (tipo biju)\n- ½ cebola\n- 75 g de manteiga\n- sal e pimenta-do-reino moída a gosto");
                Preparo.setText("Descasque e pique fino a cebola. Numa tigela, misture o coco com a farinha de mandioca. Na frigideira, coloque a manteiga e leve ao fogo médio. Quando derreter, junte a cebola, tempere com uma pitada de sal e mexa por 2 minutos, até murchar. Acrescente a farinha com o coco e misture bem. Deixe cozinhar por cerca de 5 minutos até ficar crocante, mexendo de vez em quando para não queimar. Desligue o fogo e tempere com o sal e pimenta-do-reino. Transfira para uma travessa e sirva a seguir.");

                break;

            case "Camarão ao Coco Verde":
                Ingredientes.setText("- 150 gr de camarão grande, em filete\n- 50 ml de azeite de oliva\n- 20 ml de suco de limão\n- 50 ml de água de coco natural\n- 20 ml de leite de coco\n- 1 unidade de coco verde (polpa)\n- 20 gr de tomate\n- 15 gr de pimentão vermelho\n- 3 gr de alho\n- 15 gr de cebola\n- cheiro verde\n- 1 colher (café) de sal marinho");
                Preparo.setText("Temperar os filetes de camarão com sal e limão. Refogar o alho e a cebola no azeite. Junte o camarão. Após 3 minutos, acrescente a água de coco e o leite de coco. Deixe ferver. Acrescente o tomate, o pimentão e o cheiro verde. Por ultimo, coloque a polpa do coco e retire do fogo.");
                break;

            case "Falsa Mousse de Coco Verde":
                Ingredientes.setText("- 6 cocos verdes\n- 1 caixa de leite condensado\n- 1 caixa de creme de leite\n- 1 envelope de gelatina incolor\n- 1 caixa de água de coco (use a caixa do leite condensado)\n- goiabada a gosto para a calda");
                Preparo.setText("Abra os cocos, reserve a água e retire a polpa. Coloque no liquidificador a polpa, o creme de leite, o leite condensado e a água de coco e bata tudo. Acrescente a gelatina hidratada no liquidificador junto com o restante dos ingredientes e bata mais um pouco. Coloque a mistura na forma ou em algum recipiente e sua escolha e reserve na geladeira por umas 4 horas, para firmar bem. Para calda, pegue a goiabada com um pouco de água de coco e leve ao fogo mexendo sempre até desmanchar e virar uma calda mais líquida. Tire a mousse da geladeira, desenforme, coloque a calda por cima e sirva.");
                break;

            case "Tortinha de Maçã":
                Ingredientes.setText("- Massa:\n- 1 e 1/2 xícara (chá) de FARINHA DE TRIGO\n- 1/3 xícara (chá) de MANTEIGA em temperatura ambiente\n- 1 colher (chá) rasa de FERMENTO QUÍMICO EM PÓ\n- 5 colheres (sopa) de ÁGUA\n- 1 pitada de SAL\n- 1 pitada de AÇÚCAR\n- Recheio:\n- 3 MAÇÃS pequenas sem casca e picadas\n- 1/2 colher (chá) de CANELA EM PÓ\n- 1/2 xícara (chá) de AÇÚCAR\n- 3/4 xícara (chá) de ÁGUA\n- 1 colher (sopa) cheia de AMIDO DE MILHO\n- Suco de 1/2 LIMÃO");
                Preparo.setText("MODO DE PREPARO - RECHEIO DE MAÇÃ: Coloque as maçãs picadas, a água, o açúcar, a canela em pó e o suco de limão em uma panela, cozinhe por aproximadamente 10 minutos, ou até as maçãs ficarem macias. DICA: Caso goste mais doce, acrescente mais uma colher de açúcar. Dissolva o amido de milho em 1/2 xícara de água e acrescente na panela, cozinhe por mais 2 minutos. Reserve até esfriar. MODO DE PREPARO - MASSA: Misture todos os ingredientes e amasse com a mão, caso fique grudando nos dedos acrescente mais um pouco de farinha de trigo. A massa não deve ficar muito seca. Em uma superfície enfarinhada abra a massa até ficar bem fina, corte retângulos de 15x10cm ou do tamanho que preferir. Passe clara de ovo nas bordas para colar bem, coloque o recheio no meio e feche as bordas com cuidado apertando com os dedos. Depois aperte as bordas com um garfo e frite em óleo quente até dourar. Se preferir passe no açúcar com canela.");
                break;

            case "Crumble de Maçã":
                Ingredientes.setText("- Para maçã caramelizada: \n- 150g de açúcar \n- 80g de manteiga \n- 4 maças cortadas em cubos pequenos \n- 1 canela em pau \n- 1 colher de chá de gengibre em pó\n- Para farofa de amêndoas: \n- 150g de açúcar mascavo \n- 150g de aveia em flocos \n- 150g de farinha de amêndoas \n- Canela em pó \n- 50g de manteiga");
                Preparo.setText("Para a maçã: Em uma panela pequena adicione o açúcar, mexa em fogo baixo até virar um caramelo. Acrescente a manteiga, as maçãs cortadas em cubos, canela em pau e o gengibre em pó. Deixe cozinhar até que a maçã solte bem a água e vire uma calda grossa, retire os pedaços da canela em pau e reserve. Para farofa de amêndoas: Em um recipiente fundo adicione o açúcar mascavo, a aveia em flocos, a farinha de amêndoas, a canela em pó e a manteiga. Misture os ingredientes com um garfo até criar uma farofa homogênea. Para montagem do prato: Em um bowl ou um refratário adicione a maça caramelizada com a calda, a farofa de amêndoas e coloque no forno pré aquecido a 180ºC por aproximadamente 20 minutos ou até dourarPronto para servir!");
                break;

                case "Donuts de Maçã":
                Ingredientes.setText("- 2 xícaras (chá) de farinha de trigo\n- 2 xícaras (chá) de água com gás\n- 1 colher (café) de canela em pó\n- 3 maçãs sem sementes em rodelas grossas\n- Açúcar e canela em pó para polvilhar\n- Óleo para fritar\n- Doce de leite cremoso para acompanhar");
                Preparo.setText("Em uma tigela, misture a farinha, a água com gás e a canela em pó até ficar homogêneo. Passe as rodelas de maça por essa mistura de farinha e frite, aos poucos, em óleo quente, até dourar. Retire e escorra sobre papel-toalha. Passe por açúcar e canela em pó misturados e sirva em seguida acompanhado de doce de leite.");
                break;

                case "Salpicão de Frango":
                Ingredientes.setText("- 1 quilo de filé de frango cozido com sal\n- 2 cenouras grandes\n- 300g de azeitona\n- 200g passas pretas sem caroço\n- 1 pimentão vermelho pequeno\n- 2 maçãs\n- 2 cebolas pequenas\n- maionese para dar ponto\n- salsinha, azeite e limão a gosto\n- 300g batata palha\n- folhas de alface para decoração");
                Preparo.setText("Cozinhe o frango, desfie e reserve. Rale a cenoura no ralo grosso e leve ao fogo com água e sal só para ferver. Coe e reserve. Descaroce a azeitona no sentido do comprimento bem fininha. Corte o pimentão em tirinhas bem fininhas. Rale a cebola no ralo grosso e esprema para tirar todo o excesso de líquido. Misture com os outros ingredientes, inclusive com as passas, a salsa picada e a maçã cortada também em tirinhas sem casca. Tempere todos os ingredientes com sal, limão e azeite e coloque maionese, até dar ponto. Reserve na geladeira até a hora de servir. Para servir, misture um pouco da batata palha e arrume numa tigela sobre as folhas de alface. Cubra com o restante da batata e decore com ramos de salsa e pimentão em tiras.");
                break;

            case "Cuca de Maçã":
                Ingredientes.setText("- MASSA:\n- 2 xícaras (chá) de farinha de trigo\n- 1 xícara (chá) de açúcar\n- 50 g de manteiga ou margarina\n- 1 colher (sopa) de fermento em pó\n- 2 ovos\n- 1 e 1/2 xícara (chá) de leite\n- 2 maçãs médias\n- FAROFA:\n- 1/4 xícara (chá) de manteiga\n- 1/2 xícara (chá) de açúcar\n- 1/2 xícara (chá) de farinha de trigo\n- canela a gosto");
                Preparo.setText("Em um recipiente coloque a farinha, o açúcar, o fermento em pó (peneirados) e a manteiga. Misture até obter uma farofa e reserve. Acrescente os ovos levemente batidos e o leite. Misture e reserve. Sobre uma assadeira redonda, forrada com papel alumínio, untado e polvilhado, distribua parte da massa, maçã fatiada e o restante da massa. Polvilhe com canela em pó. Faça outra camada de maça, e por fim, espalhe a farofa. Leve ao forno pré-aquecido (180°C) por 20 a 25 minutos.");
                break;

            case "Molho de Pêra":
                Ingredientes.setText("- 300 gramas de pêra em cubos\n- 100 gramas de açúcar\n- 100 ml de vinho branco\n- 1 unidade de anis estrelado\n- 200 ml de vinagre de maçã\n- 200 ml de óleo de girassol\n- 50 ml de azeite de oliva\n- Sal a gosto\n- pimenta do reino a gosto");
                Preparo.setText("Em uma panela, coloque as peras cortadas em cubos, o açúcar, o vinho branco e o anis estrelado. Deixe cozinhar de 10 a 15 minutos até que a pera esteja bem macia. Deixe esfriar e separe o caldo em um recipiente e a fruta em um mixer ou liquidificador. Bata as frutas com o vinagre de maçã, o óleo, o suco de limão e o azeite. Tempere com sal e pimenta e deixe emulsionar em velocidade alta por alguns minutos. Adicione por fim o caldo do cozimento e ajuste o tempero conforme o seu gosto, mais adocicado ou menos. (Acompanha salada de folhas mistas com nozes, castanhas, gorgonzola e tomate. )");
                break;

            case "Pêra Caramelisada":
                Ingredientes.setText("- 4 unidades de pera\n- 1 xícara (chá) de açúcar\n- 1 pau de canela\n- 2 unidades de cravo-da-índia (ou cravinho)\n- 1 xícara (chá) de Água\n- sorvete de creme a gosto");
                Preparo.setText("Descasque as pêras, corte-as ao meio e retire o miolo. Em uma frigideira grande, junte o açúcar, a canela e os cravos. Leve ao fogo e mexa até se derreter e começar a formar o caramelo. Adicione a água e deixe ferver até se desfazerem os pedaços que se formarão. Coloque as peras na calda e, sem mexer, deixe cozinhar por 3 minutos. Vire-as e cozinhe mais 3 minutos ou até ficarem macias. Sirva a pera com a calda e o sorvete.");
                break;

            case "Pêras ao Vinho Branco":
                Ingredientes.setText("- 1 kg de PERA para compota ou PERA PORTUGUESA (aproximadamente 12 peras)\n- 450 g de AÇÚCAR CRISTAL (2 ½ xícaras)\n- 400 ml de ÁGUA (1 ¾ xícaras)\n- 500 ml de VINHO BRANCO (2 xícaras) *\n- 2 paus de CANELA\n- 3 CRAVOS DA ÍNDIA\n- 5 unidades de PIMENTA DO REINO (opcional)\n- 2 ANIS ESTRELADOS (opcional)\n- 1 fava de BAUNILHA\n- Suco de 1 LIMÃO\n- *Vinho seco, sugestão: chardonnay, porém, se for usar um de sobremesa, diminua o açúcar pela metade.");
                Preparo.setText("Higienize bem as peras, corte-as ao meio e retire as sementes. Na panela, coloque todos os ingredientes exceto as peras. Mexa um pouco, e então coloque as peras arrumadas uma ao lado da outra na panela.");
                break;

            case "Fritadinhas de Pêra com massa de Cerveja":
                Ingredientes.setText("- 5g de fermento biológico fresco\n- 400 ml de leite\n- 1 xícara (chá) de farinha de trigo\n- 50 ml de cerveja\n- 1 gema\n- 1 pitada de sal\n- 1 colher (sopa) de óleo de milho\n- 4 peras maduras, mas firmes\n- Suco de 1 limão\n- Óleo de milho para fritar\n- 2 claras\n- 1 pitada de açúcar");
                Preparo.setText("Em uma vasilha, desmanche o fermento na metade do leite. Em outra tigela, misture a farinha, a cerveja, o leite restante, a gema e o sal. Misture bem até formar uma massa. Acrescente o fermento e o óleo. Cubra com filme plástico e deixe descansar por 2 horas. Descasque a pera e retire o miolo. Corte as frutas em 8 a 10 fatias e banhe no suco de limão. Aqueça o óleo em uma frigideira alta até ficar quente (170°C). Em uma tigela pequena, bata a clara com 1 pitada de açúcar até o ponto de neve (sem picos) e com uma espátula, junte à massa reservada, misturando delicadamente. Pegue cada fatia de pera com um garfo, mergulhe na massa e frite aos poucos, em óleo quente, por 2 a 3 minutos até que doure por igual. Vire a fruta com um garfo. As fatias irão subir à superfície quando estiverem cozidas. Escorra em papel-toalha. Sirva quente polvilhando açúcar de confeiteiro.");
                break;

            case "Torta de Pêra":
                Ingredientes.setText("- Massa:\n- 2 e 1/2 xícaras de farinha de trigo\n- 1 colher (sopa) de açúcar\n- 3/4 colher (chá) de sal\n- 1 xícara de manteiga sem sal, fria\n- Cerca de 6 colheres (sopa) de água gelada\n- Recheio:\n- 1kg de peras (6 a 8)\n- 1 colher (chá) de canela\n- 2 colheres (chá) de amido\n- 2/3 xícara de açúcar mascavo\n- 1/4 xícara de manteiga\n- 1 colher (chá) de limão");
                Preparo.setText("Massa: Misture a farinha, o açúcar e o sal em uma tigela (ou no processador). Corte a manteiga em pedacinhos e junte à mistura de farinha com um garfo ou misturador de massa (ou no processador) até ficar parecendo uma farofa grossa. Adicione a água gelada, uma colher de sopa de cada vez, e use um garfo para misturar (ou processador). Continue adicionando até que a massa comece a se unir. Você não quer que a massa fique muito molhada e nem colocar água demais. Você pode usar suas minhas mãos para misturar a partir deste ponto. Forme uma bola com a massa e divida-a na metade e forme duas bolas. Abra as duas metade de massa em um disco do tamanho suficiente para forrar e cobrir uma forma de torta de 22 cm. Use um rolo de massa para isso, e abra as massas sobre um pedaço de papel manteiga ou filme plástico. Cubra as massas com filme plástico e leve à geladeira por 2 horas (durante a noite é o melhor). Recheio: Descasque e retire o miolo das peras e corte em fatias grossas (cerca de 5 mm). Em uma tigela grande, misture as peras com a canela e o amido de milho. Coloque o açúcar mascavo e a manteiga em uma panela em fogo médio. Quando a manteiga derreter, acrescente as peras e o limão. Cozinhe as peras, mexendo ocasionalmente, até que elas estejam um pouco macias e a calda tenha engrossado. Cerca de 10 minutos para peras maduras e 20 a 30 minutos para as peras verdes. Remova do fogo e deixe esfriar até à temperatura ambiente. Se você não deixar esfriar antes de montar sua torta, elas vão derreter amolecer sua massa e fazer uma grande bagunça. Montagem: Preaqueça o forno a 220 graus Celsius. Forre o fundo de uma forma de torta de 22 cm com uma das metades da massa. Coloque o recheio. Cubra a torta com a outra metade de massa, certificando-se de fechar bem as bordas (você pode enrolar uma borda na outra ou grudá-las com água). Faça alguns cortes no topo da torta para permitir que o vapor escape. Pincele a torta com uma gema de ovo e polvilhe com açúcar se desejar. Asse em 220 graus Celsius por 15 minutos. Reduza o fogo para 180 graus e asse por mais 25-30 minutos ou até que o recheio esteja borbulhando. Deixe esfriar completamente antes de servir.");
                break;

            case "Crocante de Pêssego":
                Ingredientes.setText("- 8 metades de pêssegos (maduros sem caroço)\n- 50 g de manteiga gelada\n- ½ xícara (chá) de farinha de trigo\n- 3 colheres (sopa) de açúcar demerara");
                Preparo.setText("Preaqueça o forno a 200 ºC (temperatura média). Numa tigela, junte a manteiga gelada, a farinha e o açúcar demerara. Misture com as pontas dos dedos, apenas para formar uma farofa grossa. Corte uma fatia fina do lado arredondado de cada metade de pêssego - assim eles ficam retinhos e não viram na hora de assar. Transfira para um refratário, com a cavidade do caroço para cima. Preencha cada pêssego com a farofinha e leve para assar em forno preaquecido, por cerca de 20 minutos, até dourar. Sirva quente ou morno, acompanhado de sorvete ou iogurte cremoso.");
                break;

            case "Gelado de Pêssego":
                Ingredientes.setText("- 1 envelope de gelatina em pó sem sabor (12g)\n- 1 lata de pêssego em calda\n- 1 caixinha de leite condensado\n- 1 lata de creme de leite");
                Preparo.setText("Junte à gelatina 5 colheres (sopa) de água fria e leve ao fogo, em banho-maria, para dissolver. Escorra os pêssegos e bata no liquidificador com o leite condensado, o creme de leite, a gelatina dissolvida e meia xícara (chá) de água. Despeje o creme de pêssegos em taças e leve à geladeira por cerca de 4 horas. Sirva a seguir.");
                break;

            case "Pavê de Pêssego":
                Ingredientes.setText("- 1 lata de pêssego em calda\n- 1 xícara (chá) de leite\n- 1 lata de leite condensado\n- 2 unidades de gema de ovo\n- 2 colheres (sopa) de amido de milho\n- 1 caixa de biscoito champanhe");
                Preparo.setText("Coloque os pêssegos em uma peneira para escorrer a calda. Reserve ambos (a fruta e a calda). Em uma panela média, coloque o leite com o leite condensado, as gemas e o amido, misture bem e leve ao fogo, mexendo sempre até engrossar. Deixe esfriar e mexa às vezes. Reserve 2 metades de pêssego e pique o restante. Em um refratário, monte o pavê alternando camadas de biscoitos levemente umedecidos na calda reservada, creme e pêssego picado. Finalize com o creme. Decore com o pêssego reservado, cortado em tirinhas, e leve à geladeira por 2 horas antes de servir.");
                break;


            case "Geléia de Pêssego":
                Ingredientes.setText("- 5 Pêssegos (s/ casca e s/ caroço)\n- Suco e Raspas de 1 Limão\n- ½ xícara (chá) de Água\n- 3 Colheres (sopa) de Mel ou Açúcar ou Adoçante Culinário");
                Preparo.setText("Remova a casca e a semente dos pêssegos e corte em cubinhos, coloque tudo em uma panela e junte a água, suco e raspas de limão e o mel. Misture tudo muito bem, tampe e deixe cozinhar em fogo bem baixo por cerca de 20 minutos ou até ficar bem macio. Com um mixer ou no liquidificador até ficar em pedacinhos bem pequenos, desligue o fogo e deixe esfriando na panela até que fique completamente frio. Coloque em potes de vidros esterilizados e com tampa e mantenha na geladeira por até 20 dias. Sirva gelado com torradas ou com iogurte.");
                break;


            case "Chá Texano de Pêssego":
                Ingredientes.setText("- Um pedaço de gengibre 3 cm, descascado\n- 5 saquinhos de chá preto\n- 1/4 de xícara de açúcar\n- 1 1/2 xícara de néctar de pêssego\n- 3/4 de xícara de tequila\n- 2 colheres de sopa de suco de limão-taiti\n- Fatias de pêssego, para decorar\n- Cubos de gelo, para servir");
                Preparo.setText("Em uma panela média, adicione 3 xícaras de água, o gengibre e ferva. Coloque os saquinhos de chá, tire a panela do fogo e deixe em infusão por 5 minutos. Remova os saquinhos e misture o açúcar até dissolver. Deixe esfriar e descarte o gengibre. Coloque o chá, o néctar de pêssego, a tequila e o suco de limão em uma jarra e misture. Junte as fatias de pêssego. Sirva sobre o gelo.");
                break;

            case "Molho de Hortelã":
                Ingredientes.setText("- 1 xícara de chá de folhas de hortelã\n- 1/2 unidade de limão - suco\n- 1/2 xícara de chá de azeite extra virgem ou óleo de sua preferência\n- 1/2 dente de alho pequeno\n- 1/4 unidade de cebola - pequena ou a gosto\n- sal a gosto");
                Preparo.setText("Lave muito bem as folhas de hortelã e seque. Em um liquidificador coloque todos os ingredientes e bata bem. Transfira o molho para um pote de vidro com tampa. Use para temperar e depois conserve na geladeira.");
                break;



            case "Salada de Frutas com Creme de Hotelã":
                Ingredientes.setText("- Salada de frutas:\n- 4 colher(es) de sopa de açúcar\n- 3 fatia(s) de abacaxi, cortado em cubos\n- 2 bananas-pratas cortadas em cubos\n- 1 manga média, cortada em cubos\n- 1 laranja-pêra grande, sem pele e cortada em cubos\n- Creme de hortelã:\n- 2 xícara(s) de chá de leite\n- 4 colher(es) de sopa de amido de milho\n- 4 colher(es) de sopa de açúcar\n- 15 folha(s) de hortelã fresca picada\n- 4 colher(es) de sopa de margarina");
                Preparo.setText("Salada de frutas: Em uma panela, coloque o açúcar e leve ao fogo médio até derreter. Junte o abacaxi, as bananas, a manga e a laranja. Misture delicadamente e cozinhe por três minutos. Divida a salada de frutas em 10 taças individuais e reserve. Creme de hortelã: Bata no liquidificador o leite, o amido de milho, o açúcar e a hortelã por três minutos ou até ficar homogêneo. Coloque a mistura em uma panela média e leve ao fogo médio, mexendo sempre, até engrossar. Retire do fogo, acrescente a margarina e misture rapidamente.");
                break;

            case "Pesto de Hotelã":
                Ingredientes.setText("- 1 maço de hortelã\n- 1 xícara de castanha-de-caju\n- 400 ml de azeite extra virgem\n- Sal e pimenta a gosto");
                Preparo.setText("Coloque as folhas da hortelã e as castanhas no liquidificador. Acrescente 200 ml de azeite. Bata até virar uma pasta. Acrescente aos poucos o restante do azeite. Tempere a gosto.");
                break;

            case "Bolo de Hortelã":
                Ingredientes.setText("- 1 xícara de chá de hortelã\n- 1 xícara de chá de água para o chá\n- 2 xícaras de chá de açúcar\n- 1/2 xícara de chá de óleo\n- 3 maçãs\n- 3 ovos\n- 3 xícaras de chá de farinha de trigo\n- 2 colheres de sopa de hortelã picada\n- 1 colher de sopa de fermento em pó");
                Preparo.setText("Faça um chá bem forte com a hortelã e a água. Bata no liquidificador o chá com as folhas, o açúcar, o óleo, as maçãs sem casca e os ovos. Despeje essa mistura em uma tigela e junte a farinha de trigo, as cascas das maçãs picadas, a hortelã picada e o fermento. Misture. Despeje essa massa em uma assadeira untada e enfarinhada. Asse em forno médio pré-aquecido");
                break;

            case "Creme de Hortelã":
                Ingredientes.setText("- 1/3 de xicara (chá) de leite\n- 1/3 de xicara (chá) de creme de leite fresco (1)\n- 1 xicara (chá) de hortelã fresca\n- 2 gemas\n- 3 colheres (sopa) de açúcar\n- 1 colher (chá) de gelatina (usar 6 colheres de chá de água para hidratar)\n- 1/2 xícara (chá) de creme de leite fresco (2)\n- 200g de chocolate branco");
                Preparo.setText("Ferver o creme de leite (1) o leite e a hortelã por 15 min. Bata a infusão no liquidificador e coe. Misture as gemas e o açúcar. Derreta o chocolate branco no micro-ondas. Aqueça o caldo obtido ate ficar morno e verta parte dele sobre as gemas já previamente misturadas com o açúcar. Misture tudo e volte ao fogo até atingir 82 graus (ou que passando o dedo na colher ele marque, pois precisa evitar ele ficar talhado). Verta sobre o chocolate branco previamente derretido e bata no mixer com a gelatina. Reserve. Bata o creme de leite (2) em picos médios e misture delicadamente ao creme de hortelã.");
                break;

            case "Farofa de Repolho":
                Ingredientes.setText("- 1/2 repolho roxo\n- 2 xícaras (chá) de farinha de milho em flocos\n- 4 colheres (sopa) de azeite\n- 50g de manteiga sem sal\n- 3 colheres (sopa) de uvas passas\n- 1 cebola roxa cortada em cubos \n- Sal e pimenta-do-reino");
                Preparo.setText("Corte o repolho em fatias bem finas. Derreta a manteiga e o azeite numa frigideira grande, que comporte bem a farofa. Refogue a cebola até amolecer. Junte o repolho fatiado e refogue até amolecer (uns 4 minutos). Acrescente a uva passa (não precisa hidratar antes). Ponha a farinha, misture bem e cozinhe, mexendo, por alguns minutos, espargindo água até amolecer um pouco a farinha. Tempere a farofa com sal e pimenta-do-reino moída na hora a gosto. Sirva quente, como acompanhamento de assados.");
                break;

            case "Torta de Repolho":
                Ingredientes.setText("- 2 tomates picados em cubos\n- 1 cebola picada\n- 2 xícaras (chá) de repolho ralado\n- 1 pimentão vermelho picado\n- 2 ovos\n- 1 xícara (chá) de leite\n- 2 xícaras (chá) de farinha de trigo\n- 1 xícara (chá) de óleo\n- 1 colher (sopa) de fermento químico em pó\n- 1 tablete de caldo de galinha ou de legumes\n- Queijo-de-minas curado ralado a gosto");
                Preparo.setText("Bater no liquidificador os ovos, o leite, o óleo, o tablete de caldo, o queijo e a cebola. Despejar essa massa em uma vasilha e pôr o restante dos ingredientes. Misturar com uma colher e pôr em uma assadeira untada com óleo. Levar ao forno médio pré-aquecido por cerca de 25 minutos.");
                break;

            case "Salada Coleslaw":
                Ingredientes.setText("- 1 repolho verde pequeno (ou ½ grande)\n- 1 cenoura\n- ½ xícara (chá) de uvas-passas brancas\n- ½ xícara (chá) de maionese caseira\n- ¼ de xícara (chá) de vinagre de vinho branco\n- 1 ½ colher (chá) de açúcar\n- 2 colheres (chá) de sal");
                Preparo.setText("Corte o repolho ao meio e, com um fatiador de legumes (ou mandolim), corte as metades em fatias finas. Transfira para um escorredor e lave bem sob água corrente. Coloque o escorredor sobre uma tigela, tempere o repolho com o sal, o açúcar e misture bem. Deixe descansar por 10 minutos enquanto separa o restante dos ingredientes – assim o repolho libera o excesso de água e fica mais macio. Enquanto isso, separe os outros ingredientes. Descasque, passe a cenoura na parte grossa do ralador e transfira para uma tigela. Passados os 10 minutos, pressione o repolho com as mãos para escorrer bem e junte à cenoura. Acrescente a maionese, o vinagre, as uvas-passas e misture bem. Prove e, se necessário, tempere com mais sal. Sirva a seguir.");
                break;

            case "Creme de Repolho":
                Ingredientes.setText("- repolho médio\n- colheres (sopa) de farinha de trigo\n- colheres (sopa) de manteiga\n- sal a gosto\n- noz-moscada moída\n- caixinha de creme de leite\n- litro de leite");
                Preparo.setText("Corte o repolho bem picadinho, numa panela aquecida coloque a manteiga, junte o repolho aos poucos e refogue. Vá adicionando a farinha de trigo aos poucos e acrescente o leite, mexendo sempre. Quando engrossar, adicione o sal, a noz moscada e, por último, o creme de leite. Deixe ferver por dois minutos. Se quiser, acrescente o queijo ralado. Está pronto, é só servir.");
                break;

            case "Repolho Gratinado":
                Ingredientes.setText("- 1 repolho médio\n- 3 colheres (sopa) de manteiga\n- 1 cebola picadinha\n- 2 dentes de alho amassados\n- 1 xícara de leite desnatado\n- 1 caixa de creme de leite (ou creme de queijo)\n- 2 colher (sopa) de amido de milho \n- Sal a gosto\n- Cheiro verde a gosto\n- Mussarela a gosto\n- Queijo ralado para gratinar");
                Preparo.setText("Picar o repolho grosseiramente. Encher uma panela com água e levar para ferver. Quando a água começar a ferver, desligue o fogo, colocar o repolho já picado e deixe ali até murchar. Enquanto isso, derreta a manteiga em outra panela, refogue a cebola e o alho. Adicione o amido de milho. Misture bem até dissolver completamente. Adicione o leite, o creme de leite, o sal e o queijo ralado. Misture bem até engrossar. Acrescente o cheiro verde e o repolho. Misture tudo, transfira para um refratário. Cubra com mussarela e leve para gratinar no forno. Leve em média 20 minutos, mas fique de olho para não queimar. Sirva!");
                break;

            case "Purê de Abóbora":
                Ingredientes.setText("- 1/2 kg abóbora\n- 1/2 cebola média picada\n- 1 colher rasa de sopa de margarina\n- 1/2 xícara de chá de cheiro verde picado\n- 1 xícara de leite\n- 2 tablete de caldo de bacon\n- 2 colheres rasa de chá de molho de pimenta");
                Preparo.setText("Ferver a abóbora com água sem sal, quando amolecer escorra e esprema à parte em uma panela com 2 colheres de sopa de azeite. Doure bem a cebola, quando estiver bem douradinha acrescente: a margarina o cheiro-verde, o leite e o caldo de bacon. Mexa bem e coloque a abóbora espremida. Mexa bem e coloque por fim o molho de pimenta.");
                break;
            case "Gratinado de abóbora de Frango":
                Ingredientes.setText("- 3 xícaras (chá) de abóbora japonesa cozida no vapor\n- 2 colheres (sopa) de manteiga\n- 1 xícara (chá) de leite\n- 4 colheres (sopa) de cheiro-verde picado\n- 1 colher (chá) de manjericão fresco picado\n- 2 colheres (sopa) de azeite de oliva ou óleo de girassol\n- 1 cebola média picada\n- 2 dentes de alho picados\n- 1/2 xícara (chá) de molho de tomate\n- 3 xícaras (chá) de frango cozido ou assado desfiado\n- 1 xícara (chá) de requeijão cremoso\n- 1/2 xícara (chá) de queijo mussarela ralada\n- sal a gosto\n- noz-moscada a gosto");
                Preparo.setText("Amasse a abóbora com um garfo. Coloque-a numa tigela e acrescente o sal, a noz-moscada, a manteiga, o leite, metade do cheiro-verde e o manjericão. Reserve. Para fazer o recheio, aqueça o azeite ou o óleo numa panela e doure a cebola e o alho. Junte o molho de tomate e o frango e refogue, mexendo por 5 minutos. Adicione o cheiro-verde restante e retire do fogo. Em um refratário, acomode metade da abóbora, o frango refogado, espalhe o requeijão e cubra com a abóbora restante. Polvilhe a mussarela e leve ao forno, preaquecido, em temperatura alta (200 ºC a 220 ºC), até a mussarela derreter e formar uma crosta.");
                break;

            case "Risoto de Abóbora":
                Ingredientes.setText("- 2 xícaras de arroz arbóreo\n- 2 tabletes de caldo de legumes\n- 500 g de abóbora em cubos\n- cheiro-verde picado a gosto\n- 1/2 copo de vinho branco\n- 3 dentes de alho\n- 1 cebola grande picada\n- 1 litro de água\n- 4 colheres de azeite\n- sal e pimenta-do-reino a gosto\n- 100 g de mussarela ou queijo parmesão\n- 4 colheres (sopa) de requeijão");
                Preparo.setText("Leve a abóbora ao fogo com azeite, alho e metade da cebola e água o suficiente para cobri-la. Deixe-a cozinhar até ficar bem macia. Retire do fogo e coloque toda a abóbora no liquidificador com metade do caldoBata a abóbora e acrescente as colheres de requeijão. Misture bem até ficar homogêneo e reserve. Aqueça à parte 1 litro de água com os dois tabletes de caldo de legumes. Mantenha aquecido em fogo baixo enquanto prepara o arroz. Em outra panela, refogue metade da cebola. Acrescente o arroz arbóreo e misture. Adicione o vinho branco e espere-o evaporar. Acrescente em conchas o caldo de legumes quente ao arroz. Conforme o caldo for secando, coloque outra concha até o risoto ficar cremoso e al dente. Quando o caldo tiver acabado, acrescente o cheiro-verde, pimenta-do-reino e sal a gosto. Misture o purê de abóbora ao arroz cozido. Adicione o queijo ralado e misture levemente para derreter. Sirva quente com queijo ralado por cima.");
                break;

            case "Torta de Abóbora e Couve":
                Ingredientes.setText("- 250g de farinha de trigo\n- 125g de manteiga \n- 1 colher (chá) de sal marinho\n- 4 a 6 colheres (sopa) de água fria ou gelada\n- 4 a 6 colheres (sopa) de azeite\n- 1 cebola roxa em fatias finas\n- 800g de abóbora japonesa, descascada e ralada no ralo grosso (se quiser, cozinhe antes) \n- 200g de couve fresca fatiada finamente \n- Sal marinho e pimenta-do-reino a gosto\n- 3 ovos caipiras grandes\n- 400 ml de leite integral\n- 100g de queijo gruyère\n- 1 boa pitada de noz-moscada");
                Preparo.setText("Massa: 1Ponha a farinha num processador, tempere com sal, junte a manteiga e bata no modo pulsar. (Se preferir fazer manualmente, ponha a farinha e a manteiga numa vasilha grande e mexa com as mãos até fazer uma farofa grossa). Adicione a água, colher por colher, mexendo a cada vez, até formar uma pasta homogênea. Faça uma bola com a massa, enrole num filme plástico e leve à geladeira por meia hora. Quando a massa estiver fria, abra-a com um rolo e forre uma assadeira de quiche de 24 cm (de fundo removível e bordas baixas). Preaqueça o forno a 180ºC. Cubra a massa com papel-manteiga e ponha um peso (feijões crus) sobre ela. Asse a massa coberta por 15 minutos, depois tire o papel e o peso e volte a massa descoberta ao forno por mais 10 minutos. Tire do forno e deixe esfriar. Recheio: Ponha o azeite em uma frigideira e refogue a cebola até estar macia, junte a abóbora ralada (ou esmagada) e refogue por dez minutos. Junte a couve fatiada, tempere com sal e pimenta e deixe cozinhar por alguns minutos. Tire do fogo e deixe esfriar. Quebre os ovos em uma vasilha a parte e misture bem, adicione o leite, tempere com sal e pimenta, noz-moscada e o queijo ralado. Mexa bem para misturar tudo. Junte a mistura de ovos à abóbora refogada e já fria, misture tudo muito bem para formar um recheio homogêneo. Torta: Despeje o recheio de abóbora, couve e queijo sobre a massa de torta já assada e já fria. Leve ao forno preaquecido e asse a 180ºC por aproximadamente 30 minutos, ou até o recheio estar dourado e levemente firme. Tire do forno, desenforme e sirva quente ou em temperatura ambiente, acompanhada de salada de folhas.");
                break;

            case "Abóbora assada com shoyu e mel":
                Ingredientes.setText("- 1 colher (sopa) de mel\n- 4 colheres (sopa) Molho Shoyu Suave\n- 1 colher (sopa) de azeite de oliva\n- meia abóbora japonesa com casca cortada em fatias (1 kg)\n- 2 pitadas de pimenta-do-reino preta moída");
                Preparo.setText("Em uma tigela pequena, coloque o mel, o molho shoyo e o azeite, e misture. Reserve. Disponha a abóbora em uma assadeira retangular média (22 x 33 cm), regue com o molho reservado e polvilhe com a pimenta-do-reino. Leve ao forno quente (200 graus), pré aquecido, por 35 minutos, ou até que a abóbora doure levemente. Retire do forno e sirva em seguida.");
                break;

            case "Sopa de Abóbora com Grão de Bico e Costela":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Creme de Abóbora com Bacon":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Bacon Frito e Cebolinha picada para Polvilhar":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Croquete de Abóbora com Carne-Seca":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Risoto de Abóbora com Carne-Seca":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Doce de Abóbora com Coco Ralado":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Viradinho de Milho Verde":
                Ingredientes.setText("- 4 espigas de milho (cerca de 3 xícaras (chá) de milho debulhado, caso queira usar o congelado)\n- 1 cebola\n- 1 ½ colher (sopa) de manteiga\n- 1 xícara (chá) de farinha de milho flocada\n- 2 xícaras (chá) de água\n- ½ maço de salsinha\n- sal e pimenta-do-reino moída na hora a gosto");
                Preparo.setText("Descarte a palha, o cabelo e lave bem as espigas de milho sob água corrente. Numa tábua (ou dentro de uma assadeira grande), apoie uma das espigas de pé e com uma faca corte os grãos de milho para debulhar (se preferir, utilize um extrator de grãos próprio para milho). Transfira os grãos para uma tigela e repita com as outras espigas. Descasque e pique fino a cebola. Lave, seque e pique fino as folhas de salsinha. Leve uma panela média ao fogo baixo. Quando aquecer, junte a manteiga, a cebola, tempere com uma pitada de sal e refogue por cerca de 3 minutos, mexendo bem, até murchar. Acrescente os grãos de milho e refogue por cerca de 5 minutos, até que o milho ganhe um tom mais vivo. Regue com a água, misture e deixe os grãos cozinharem por cerca de 5 minutos - a água não deve secar, pois vai umedecer a farinha no próximo passo. Acrescente a salsinha picada e tempere com sal e pimenta-do-reino a gosto. Mantenha a panela em fogo baixo e junte a farinha de milho flocada aos poucos, sem parar de mexer - o virado deve ficar bem úmido. Desligue o fogo, transfira para uma travessa e sirva a seguir.");
                break;

            case "Cural de Milho Verde":
                Ingredientes.setText("- 6 espigas de milho verde\n- 1 litro de leite\n- 1 e 1/2 xícara (chá) de açúcar\n- 1 colher (chá) de sal\n- 1 colher (sopa) de amido de milho (maisena) \n- Canela em pó, para polvilhar");
                Preparo.setText("No liquidificador, bata os grãos de milho com o leite. Passe por uma peneira e leve ao fogo médio com os outros ingredientes. Cozinhe por 30 minutos, mexendo de vez em quando. Espere esfriar e sirva polvilhado de canela.");
                break;
            case "Brigadeiro de Milho Verde":
                Ingredientes.setText("- 2 latas (200 g cada) de milho verde \n- 1 lata de leite condensado (395 gramas)\n- 2 colheres (sopa) de manteiga sem sal à temperatura ambiente\n- 1/2 xícara de leite\n- 2 xícaras de farinha de milho flocada");
                Preparo.setText("Retire os grãos da lata e drene toda a água. Transfira-os para o liquidificador, adicione o leite e bata até formar uma pasta homogênea. Leve a mistura para uma panela antiaderente, acrescente o leite condensado e a manteiga. Mantenha em fogo médio, mexendo bem até soltar completamente do fundo da panela. Transfira a mistura para uma vasilha e espere esfriar. Cubra com filme plástico e leve à geladeira até ficar firme. Enrole os brigadeiros e passe um a um na farinha de milho flocada.");
                break;

            case "Tortilha de Milho":
                Ingredientes.setText("- 3 espiga de milho verde\n- a gosto de azeite\n- a gosto de água\n- a gosto de fubá fino\n- a gosto de sal\n- 1 espiga de milho verde debulhado\n- 1 colher de sopa de manteiga\n- 1 dente de alho picado\n- 1/2 unidade de Cebola roxa picada em cubos pequenos\n- 1 unidade de pimenta dedo de moça sem sementes, cortada em cubos pequenos\n- 1 folha de coentro\n- 1 unidade de abacate em fatias finas\n- a gosto de sementes de romã para decorar");
                Preparo.setText("Rale o milho e bata no liquidificador com azeite e água até ficar homogêneo. Despeje em uma travessa e acrescente o fubá, sovando até atingir textura de massa de pão. Deixe descansar por duas horas. Use um abridor de massas para deixar com espessura fina e corte os círculos com o auxílio de um prato. Toste cada um individualmente em frigideira quente com óleo, azeite ou manteiga. Para preparar o recheio, refogue o milho com alho na manteiga. Desligue o fogo e acrescente a cebola roxa, o coentro e a pimenta. Sirva por cima da tortilla com fatias de abacate, folhas e sementes de romã.");
                break;
            case "Nhoque de Milho Verde":
                Ingredientes.setText("- 2 latas de milho\n- 50 g de amido de milho\n- 480 ml de leite\n- sal a gosto\n- pimenta-do-reino a gosto\n- 100 g de queijo parmesão ralado\n- 20 ml de azeite\n- 340 g de molho de tomate napolitano");
                Preparo.setText("Coloque o milho no liquidificador junto com o leite e bataPasse o líquido por uma peneiraEm uma panela coloque o milho passado pela peneira, o azeite, o amido de milho, o queijo, sal e a pimenta a gostoLeve ao fogo, mexendo sempre, até que a massa solte do fundo; deixe esfriarFaça bolinhas com a massaEm uma frigideira, aqueça o azeite e salteie os nhoquesAcrescente o molho napolitanoSirva com queijo ralado e salsa");
                break;

            case "Bolo de Milho":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Curau":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Canjica":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Pamonha Assada":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Creme de Milho":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Gelado de Abacaxi":
                Ingredientes.setText("- 1 abacaxi picado\n- 2 copos de água\n- 1 lata de creme de leite sem soro\n- ½ xícara de açúcar (80 gramas)\n- 1 lata de leite condensado\n- 1 envelope de gelatina de abacaxi");
                Preparo.setText("Prepare a gelatina sabor abacaxi como mostra no envelope, reserve. Em uma panela coloque o abacaxi picado em cubos, a água e o açúcar. Ferva uns 15 minutos e reserve. No liquidificador, coloque o leite condensado, o creme de leite, a gelatina sabor abacaxi e bata bem, até ficar bem uniforme. Incorpore o creme no abacaxi cozido, mexendo bem. Em um refratário de vidro, coloque o creme pronto e leve ao refrigerador por 4 a 5 horas. Retire na hora de servir.");
                break;
            case "Torta Gelada de Abacaxi e Coco":
                Ingredientes.setText("- Creme:\n- 3 gemas\n- 1 colher (sopa) de amido de milho\n- 1 lata de leite condensado (395g)\n- 200 ml de leite de coco\n- Abacaxi\n- 700 g de abacaxi em calda drenado e picado (2 latas- reserve o caldo)\n- ¼ xícara de açúcar (50g)\n- Cobertura:\n- 3 claras\n- ½ xícara de açúcar (100g)\n- 200g de creme de leite (em lata) sem soro e gelado\n- Montagem:\n- Biscoitos champagne\n- 1 xícara de coco ralado (prefira o coco fresco)");
                Preparo.setText("Creme: Em uma panela coloque o leite condensado e o leite de coco e leve ao fogo baixo até ferver e desligue o fogo. Enquanto isso coloque as gemas em uma tigela, bata ligeiramente com um garfo, adicione o amido de milho e misture bem. Usando uma concha, retire um pouco da mistura de leites fervente e despeje na tigela misture bem.");
                break;
            case "Abacaxi Assado":
                Ingredientes.setText("- 1 unidade de abacaxi\n- 1 fava de baunilha (ou essência)\n- 4 colheres de sopa de água\n- 200 ml de água\n- 125 gramas de açúcar\n- 1 unidade de laranja (suco)\n- 1 colher de sopa de rum\n- * a gosto de sorvete");
                Preparo.setText("Descasque o abacaxi, corte-o em seis partes iguais sem o miolo. Corte a fava de baunilha ao meio e raspe o interior para extrair as sementes. Despeje as quatro colheres de água em uma panela, acrescente as sementes de baunilha, o suco da laranja (e a casca) e coloque para ferver. Retire do fogo, cubra e deixe assim durante 15 minutos. Em uma panela grande, coloque o açúcar e a água e cozinhe até obter a cor de caramelo. Retire do fogo sem ferver e adicione a água com baunilha, da qual você deve retirar a casca da laranja. Quando estiver morna, acrescente o rum. Despeje o líquido sobre os pedaços de abacaxi, leve ao forno pré-aquecido a 160 graus C e deixe assar por 1h 45. Regue regularmente com o próprio suco do cozimento. Depois de assado, corte os pedaços de abacaxi em fatias de 1 cm de espessura. Sirva com uma bola de sorvete.");
                break;

            case "Frango com Abacaxi":
                Ingredientes.setText("- 2 peitos de frango cortado em tiras\n- ½ abacaxi em cubos\n- 1 colher de sopa de manteiga\n- 2 colheres de sopa de azeite\n- 1 colher de sopa de mel\n- 4 dentes de alho\n- 2 colheres de sopa de suco de limão\n- ½ colher de chá de pimenta calabresa\n- ½ colher de chá de pimenta do reino (de preferência utiliza a branca)\n- ¼ de xícara de salsa fresca picada\n- Sal a gosto");
                Preparo.setText("Comece preparando o molho, misturando o suco de limão, 1 colher de azeite, o mel e as pimentas. Em uma panela, derreta a manteiga junto com a outra colher de azeite, e adicione o alho amassado e quando o mesmo começar a doura, adicione o peito de frango. Por último, adicione o abacaxi e o molho, misture bem e cozinhe por alguns minutos para o abacaxi ficar bem macio. Depois disso, com a panela fora do fogo, finalize com a salsa.");
                break;
            case "Bolo de Abacaxi":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Mousse de Abacaxi":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Abacaxi com Calda de Maracujá":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Taça de Abacaxi":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Doce De Abacaxi Com Doce De Leite":
                Ingredientes.setText("- 1 lata de doce de leite\n- 1 pacote de bolacha maisena\n- 1 abacaxi picado\n- 3 xícaras de água\n- 4 colheres de açúcar\n- 1 lata de creme de leite\n- 1 lata de leite condensado\n- 1 envelope de gelatina de abacaxi\n- 1/2 pacote de coco ralado queimado");
                Preparo.setText("Em uma panela coloque a água, o açúcar e o abacaxi cortado em cubos e deixe cozinhar de 7 a 10 minutos. Escorra o abacaxi e reserve o caldo. Bata no liquidificador o leite condensado, creme de leite e gelatina já hidratada. Depois, acrescente manualmente o abacaxi sem a calda. Para a montagem, coloque uma camada do creme de abacaxi e raspas de limão. Depois, passe a bolacha na calda do abacaxi e faça uma camada. Finalize cobrindo com uma camada do doce de leite e polvilhe o coco ralado.");
                break;

            case "Quiche de Alho Poró":
                Ingredientes.setText("- MASSA:\n- 1 xícara e 1/2 de farinha de trigo\n- 100 g de margarina\n- 1/2 lata de creme de leite sem soro\n- 1 colher de chá de sal\n- 1 colher de chá de fermento em pó\n- RECHEIO:\n- 2 colheres de sopa de manteiga\n- 1 colher de sopa de cebola\n- 2 colheres de sopa de farinha de trigo\n- 300 ml de leite\n- 2 gemas\n- 1/2 pacote de queijo ralado\n- 1/2 lata de creme de leite sem soro\n- 2 alhos poró\n- 1/2 xícara de cebolinha verde\n- Temperos a gosto\n- COBERTURA:\n- 2 claras\n- 3 colheres de sopa de queijo ralado\n- Queijo para polvilhar");
                Preparo.setText("Em um recipiente, coloque a farinha (reserve um pouco), a margarina ou manteiga, creme de leite (sem soro), o sal e o fermento. Misture com as mãos (neste momento, se necessário, utilize a farinha reservada). Sove sobre superfície levemente enfarinhada. Deixe descansar por 10 minutos (opcional). Distribua a massa em uma assadeira redonda n°25 (não precisa untar). Fure com auxílio de um garfo toda a superfície. Leve ao forno 200° graus por 10 minutos (pré-asse a massa). Retire do forno e espalhe o recheio e sobre ele a cobertura. Polvilhe com queijo ralado. Leve novamente ao forno pré-aquecido 200° graus por aproximadamente 15 a 20 minutos. RECHEIO: Em uma panela, derreta a manteiga e refogue a cebola. Coloque a farinha e mexa. Junte o leite aos poucos, sempre mexendo, até engrossar. A seguir, adicione o sal, pimenta, gemas, creme de leite, queijo ralado, cebolinha ou salsinha e o alho poro fatiado e aferventado previamente. Misture. COBERTURA: Na vasilha da batedeira coloque as claras e bata em neve. Desligue. Adicione o queijo ralado e misture com auxílio de uma colher.");
                break;

                case "Sopa de Alho Poró":
                Ingredientes.setText("- 7 ou 8 batatas médias \n- 1 alho-poró grande\n- 1 cebola pequena \n- 2 colheres (sopa) de azeite virgem\n- 2 cubos de caldo de galinha (ou de legumes)\n- 2 litros de água\n- sal e pimenta-do-reino a gosto");
                Preparo.setText("Lave e descasque as batatas. Corte-as em cubos grandes. Lave e corte o alho-poró em rodelas grossas. Reserve uma porção pequena para finalização do prato. Corte a cebola em pedaços pequenos. Em uma panela grande, refogue a cebola e o alho-poró no azeite até que a cebola fique transparente. Refogue por cerca de 4 minutos. Acrescente as batatas cruas cortadas e refogue mais um pouco. Junte a água, os tabletes de caldo (galinha ou legumes) e cozinhe até que as batatas estejam no ponto de purê. Tempere com sal e pimenta a gosto. Espere esfriar um pouco e bata tudo no liquidificador até ficar bem homogêneo. Coloque em uma travessa para ser servida e acrescente o alho-poró reservado por cima. Aproveite para consumi-la quente ou fria!");
                break;
            case "Farofa de Alho Poró":
                Ingredientes.setText("- 2 colheres (sopa) de margarina light\n- 2 colheres (sopa) de azeite de oliva\n- 1 alho-poró grande picado\n- 2 xícaras (chá) de farinha de mandioca torrada\n- 3 colheres (sopa) de salsa (ou salsinha) picada\n- sal a gosto\n- pimenta-do-reino a gosto");
                Preparo.setText("Numa panela, aqueça a margarina e o azeiteDepois refogue o alho-poró, mexendo por cerca de 3 minutosAdicione a farinha, aos poucos, e mexa por mais 3 minutosTempere a gosto, acrescente a salsa e sirva em seguida");
                break;

            case "Picadinhdo de Carne ao Alho Poró":
                Ingredientes.setText("- 1 kg de coxão mole\n- 2 dentes de alho\n- 1 cebola média\n- 2 caldos de carne\n- 1 pimentão de cada cor\n- 4 tomates\n- 1 alho poró\n- 3 colheres de óleo\n- 1 pitada de sal");
                Preparo.setText("Refogue a cebola e o alho. Coloque a carne cortada em cubos para refogar. Quando a carne estiver macia coloque os pimentões em cubos. Coloque o caldo de carne deretido em 1/2 xícara de água quente. Mexa e se não deu o ponto de sal na carne. Coloque mais uma pitada de sal e o alho poró. Abafe a panela por 10 minutos. Sirva.");
                break;
            case "Arroz com queijo e Alho Poró":
                Ingredientes.setText("- 2 xícaras (chá) de arroz\n- 2 colheres (sopa) de óleo\n- 1 cebola pequena picada\n- 4 xícaras (chá) de caldo de legumes\n- 1 lata de milho escorrida\n- 400 gramas de queijo de minas (ou branco) cortado em cubos\n- 2 talos de alho-poró lavados e cortados em rodelas bem finas\n- sal a gosto\n- óleo para fritar");
                Preparo.setText("Lave e escorra o arroz. Em uma panela, aqueça o óleo e refogue a cebola, junte o arroz e refogue por mais alguns minutos até secar. Despeje o caldo de legumes, o milho, acrescente sal, se necessário, e cozinhe no fogo brando até secar totalmente o caldo. Desligue o fogo e, com um garfo, solte o arroz. Coloque em uma travessa e misture delicadamente os cubos de queijo. Mantenha quente. Aqueça o óleo e frite as rodelas de alho-poró até dourar. Distribua sobre o arroz e sirva em seguida.");
                break;
            case "Bolo de Ameixa":
                Ingredientes.setText("- 4 ameixas frescas bem maduras e firmes\n- 3 ovos\n- 6 colheres(sopa) de açúcar\n- 6 colheres(sopa) de farinha de trigo\n- 1 colher(chá) de fermento em pó\n- 1 colher (sopa) para untar\n- 2 colheres (sopa) de açúcar para polvilhar");
                Preparo.setText("Unte um refratário com manteiga, acomode as ameixas lavadas e partidas em quartos e polvilhe com açúcar. Reserve. Numa batedeira, bata as claras em neve, junte as gemas e o açúcar e sempre batendo adicione o fermento e a farinha de trigo. Despeje esta massa sobre as ameixas e leve-os ao forno em temperatura média, pré-aquecido, por cerca de 20 minutos.");
                break;
            case "Geléia de Ameixa":
                Ingredientes.setText("- 10 ameixas vermelhas maduras\n- Açúcar");
                Preparo.setText("Descasque as ameixas e rale-as no ralador grosso. Meça-as numa jarra medidora. Para cada medida de ameixas coloque duas medidas de açúcar. Leve tudo ao fogo até a calda estar em ponto de fio. Deixe esfriar bem para verificar se está no ponto certo (consistência de mel). Guarde em potes herméticos, previamente esterilizados. Se for para consumo imediato, não necessita esterilizar o frasco nem guardar em geladeira.");
                break;
            case "Torta de Ameixa":
                Ingredientes.setText("- 2 xícaras de farinha de trigo\n- 3/4 xícara de nozes finamente picadas\n- 3/4 xícara de açúcar mascavo claro\n- 12 colheres de sopa de manteiga sem sal gelada (1 1/2 tabletes), cortada em cubos\n- 1 gema de ovo\n- 900 g ameixas italianas maduras e firmes, sem caroço e cortadas em quartos longitudinalmente");
                Preparo.setText("Pré-aqueça o forno a 200 ºC. Junte a farinha, nozes e açúcar em uma tigela grande. Adicione a manteiga e a gema de ovo. Bata à mão ou com uma batedeira, até ficar quebradiço. Pressione 1 1/2 xícaras da mistura de massa formando uma camada uniforme no fundo de uma assadeira de 24 cm. Arrume as ameixas sobre a massa, com o lado da pele para baixo, formando um desenho em forma de flor; coloque as ameixas de fora para dentro. Polvilhe o resto da mistura de massa uniformemente sobre as ameixas. Asse a torta por 40 a 50 minutos, ou até que a massa esteja levemente dourada e o recheio de ameixa borbulhando. Retire do forno e deixe esfriar por 10 minutos. Retire da assadeira e transfira a torta para um prato raso. Sirva quente ou à temperatura ambiente.");
                break;

            case "Rocambole de creme de limão e Ameixa":
                Ingredientes.setText("- Recheio:\n- 1 lata de leite condensado\n- 6 colheres (sopa) de suco de limão\n- meia colher (sopa) de raspas da casca de 1 limão\n- Massa:\n- 4 ovos\n- meia xícara (chá) de açúcar\n- meia xícara (chá) de farinha de trigo peneirada\n- Montagem:\n- 2 xícaras (chá) de ameixa fresca\n- açúcar de confeiteiro para polvilhar");
                Preparo.setText("Recheio: Em um recipiente misture o leite condensado e o suco de limão até formar um creme consistente. Adicione as raspas da casca de limão e reserve em geladeira até o momento da montagem. Massa: Em uma batedeira, bata os ovos com o açúcar até dobrar de volume. Desligue a batedeira e misture a farinha de trigo aos poucos, delicadamente. Coloque em uma forma retangular grande (30x40cm) untada com manteiga e forrada com papel-manteiga untado com manteiga e asse em forno médio-alto (200°C), pré aquecido, por cerca de 30 minutos. Desenforme ainda quente sobre um pano seco e polvilhado com açúcar e espere esfriar. Montagem: Espalhe o recheio reservado e gelado sobre a massa (deixando cerca de 2 cm de espaço em cada lateral) e distribua as ameixas. Enrole delicadamente (no sentido com comprimento), coloque sobre um prato de servir e polvilhe o açúcar de confeiteiro. Sirva a seguir.");
                break;
            case "Picolé de iogurte e Ameixa":
                Ingredientes.setText("- 3 copos de iogurte natural (170g cada);\n- 5 colheres (sopa) da geleia de ameixa (anterior)\n- palitos de picolé;\n- copos descartáveis ou forminhas próprias para picolé.");
                Preparo.setText("Adicione a geleia no iogurte, misture bem, coloque nas forminhas de picolé ou nos copinhos descartáveis. Tampe com papel alumínio, faça um furinho no papel e coloque o palito. Leve ao freezer por 3 a 4 horas, até endurecer.");
                break;

            case "Berijela Recheada":
                Ingredientes.setText("- 1 berinjela\n- 1 cebola\n- 2 dentes de alho\n- 2 tomates\n- 2 colheres (sopa) de azeite\n- sal e pimenta-do-reino moída na hora a gosto\n- folhas de manjericão a gosto\n- queijo parmesão ralado a gosto");
                Preparo.setText("Pré aqueça o forno a 180 ºC (temperatura média). Descasque e pique fino a cebola e os dentes de alho. Lave, seque e corte o tomate ao meio; descarte as sementes e corte em cubos pequenos. Com uma escovinha para legumes, lave a casca da berinjela sob água corrente. Corte a berinjela ao meio, no sentido do comprimento, e, com a ponta da faca, retire a polpa de cada metade, deixando cerca de 1 cm de borda - a berinjela fica no formato de uma canoa. Pique a polpa da berinjela e reserve. Leve uma frigideira ao fogo médio. Quando aquecer, regue o azeite, junte a cebola e o alho. Refogue por 3 minutos até murchar. Acrescente a polpa da berinjela picada e misture bem. Deixe cozinhar por cerca de 5 minutos até ficar macia. Junte o tomate e o manjericão e deixe cozinhar por mais 3 minutos. Tempere com sal e pimenta e desligue o fogo. Com uma colher, preencha cada metade de berinjela com o refogado, polvilhe com o queijo parmesão ralado e transfira para uma assadeira. Leve ao forno para assar até dourar. Sirva a seguir.");
                break;
            case "Berinjela à Pamegiana":
                Ingredientes.setText("- 3 BERINJELAS CORTADAS NA HORIZONTAL\n- 6 OVOS\n- FARINHA DE ROSCA\n- FARINHA DE TRIGO\n- SAL A GOSTO\n- MANJERICÃO\n- 8 TOMATES EM PEDAÇOS\n- ORÉGANO\n- MUÇARELA A GOSTO\n- 800 G DE MOLHO DE TOMATE");
                Preparo.setText("Em um bool coloque água e sal. Coloque as berinjelas e deixe por 20 minutos. Retire e seque as berinjelas. Bata os ovos e tempere com sal, salsa, manjericão. Empane as fatias de berinjela primeiro com farinha de trigo, depois passe nos ovos e depois na farinha de rosca. Coloque para assar no forno 200 graus por 15 minutos. Tempere os tomates picados com sal, orégano, azeite, salsa, retire as berinjelas do forno. Em uma forma coloque em cada fatia molho, tomates picados e a mozarela, coloque novamente ao forno até derreter o queijo.");
                break;
            case "Antepasto de Berinjela":
                Ingredientes.setText("- 2 berinjelas\n- 1/2 pimentão verde\n- 1/2 pimentão vermelho\n- 1/2 pimentão amarelo\n- 1/2 xícara de azeitonas sem caroço\n- 2 cebolas grandes picada (ou 5 pequenas)\n- 1 pimenta dedo de moça opcional\n- 1 colher (sopa) de orégano\n- 2 folhas de louro\n- Pimenta do reino\n- Sal a gosto\n- Azeite o quanto der\n- Vinagre de maça (ou outro)");
                Preparo.setText("Pique a berinjela em cubinho ou rale. Coloque dentro de um recipiente grande, encha com água e deixe de molho por 30 minutos com vinagre. Pique o restante dos ingredientes. O alho deve ser picado bem pequeno ou amassado. Em uma forma grande, junte todos os ingredientes. Coloque a berinjela, os pimentões, a azeitona, a cebola e a pimenta dedo de moça. Regue tudo com azeite, não tenha medo de colocar, eu coloco cerca de 100-150 ml. Adicione o alho, o sal, orégano, a folha de louro picada e a pimenta do reino. Adicione mais azeite se achar necessário. Misture tudo e tampe a forma com papel alumínio. Leve para assar em forno pré aquecido por cerca de 1 hora e 20 minutos. Na metade do tempo, retire o papel alumínio e misture tudo novamente. Volte ao forno e deixe terminar de assar. Desligue o forno, delicie-se.");
                break;

            case "Escabeche de Berinjela":
                Ingredientes.setText("- 2 berinjelas\n- 1/2 copo de vinagre de maçã\n- 1/2 copo de azeite\n- 1 cebola\n- 2 colheres de alcaparras em conserva (opcional)\n- 1/2 tomate (opcional)\n- 1 xícara de azeitona sem caroço\n- 5 dentes de alho amassados ou picados\n- sal, pimenta e temperos verdes a gosto");
                Preparo.setText("Comece o preparo lavando e higienizando muito bem as berinjelas. Corte-as em cubos médios/pequenos e coloque-as em uma assadeira. Dica: você pode misturar uma pitada de sal e um pouquinho de azeite para acelerar o processo de desidratação. Leve ao forno por 20 minutos a 230º C aproximadamente e reserve. Em uma panela grande, coloque o azeite, a cebola picada e o alho e refogue bem. Junte a berinjela e mexa tudo por uns 5 minutos. Despeje o vinagre, as azeitonas picadas, os tomates picados e os temperos a gosto. Mexa e misture tudo muito bem por pelo menos 10 minutos. Desligue o fogo, espere esfriar e misture as alcaparras. Leve à geladeira em um pote com tampa. Sirva no mesmo dia ou guarde no pote até consumir!Dica: essa receita fica ainda mais gostosa acompanhada de torradas ou pães. Você também pode incorporá-la em um molho para o seu macarrão!");
                break;
            case "Strogonoff de Berinjela":
                Ingredientes.setText("- 3 dentes de alho em cubos pequenos ou amassadinho\n- 1 cebola em cubinhos\n- 2 berinjelas médias em cubos maiores\n- 1 lata de tomate pelado ou 250 gr de molho pronto\n- 1 lata de creme de leite\n- 2 colheres de sopa de mostarda amarela,\n- 2 colheres de sopa de azeite,\n- Cheiro verde sal e pimenta á gosto.");
                Preparo.setText("Com as berinjelas já em cubos, deixe de molho por 15 minutos em uma tigela com água e vinagre para tirar o gosto amargo,Em uma panela coloque 2 colheres do azeite e acrescente a cebola até ficar transparente, adicione o alho e refogue até dourar,Retire a berinjela da agua e aperte para sair o excesso de água delas, jogue ela na panela com o refogado, tempere com sal e pimenta e refogue até ficarem macias mas sem perder a textura (se deixar demais a berinjela vai se desmanchar, lembre-se que ainda teremos a etapa do molho),Acrescente o tomate pelado desmanchado, a mostarda e refogue até o tomate se desmanchar e reduzir o suco,Quando o molho estiver mais sequinho, adicione o creme de leite, misture e desligue o fogo antes que comece a borbulhar, se necessário acerte o sal. Acrescente o cheiro verde e sirva quentinho!");
                break;
            case "Bolinho de Cará":
                Ingredientes.setText("- 1 cará médio, cozido e espremido (350 g)\n- 1 ovo\n- 3 colheres (sopa) de margarina sem sal\n- 3 colheres (sopa) de queijo tipo parmesão ralado\n- meia xícara (chá) de farinha de trigo\n- 1 sachê de caldo de legumes\n- 100 g de mussarela cortada em cubos de 2 cm\n- 1 gema de ovo batida");
                Preparo.setText("Em uma tigela grande, coloque o cará, o ovo, a margarina, o queijo ralado, a farinha de trigo, aos poucos, e o caldo de legumes. Misture bem, com o auxílio de uma colher, até obter uma massa homogênea. Divida a massa em pequenas porções, recheie cada uma com 1 cubo de queijo e modele esferas de 4 cm de diâmetro. Disponha-as em uma assadeira grande untada, pincele com a gema e leve ao forno médio (180 graus), pré aquecido, por 20 minutos, virando na metade do tempo. Retire do forno e sirva em seguida.");
                break;
            case "Berinjela à Milanesa":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Bolinho de Berinjela":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Entrada Frio de Berinjela Japonesa":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Salada de Berinjela Grelhada e Queijo de Cabra":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Berinjela com Missô":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Mabonasu (Berinjela Apimentada)":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Sopa de Cará":
                Ingredientes.setText("- 400 g de cara sem casca\n- 100 g de abobora\n- 200 g de frango cozido e desfiado\n- 1 cebola pequena picadinha\n- 2 dentes de alho amassados\n- Ervas frescas a gosto\n- Sal a gosto\n- Pimenta do reino a gosto");
                Preparo.setText("Lave bem o cara e a abobora. Cozinhe o frango e desfie. Enquanto isso, cozinhe o cara junto com a abobora. Adicione os temperos, e metade da cebola. Depois bata no liquidificador junto com um pouco da água do cozimento. Refogue a cebola e o alho no azeite. Despeje o creme batido no liquidificador. Coloque o frango desfiado, misture tudo e acerte o sal. Se preferir que sua sopa fique um pouco mais líquida adicione mais água. Misture tudo em fogo médico por 5 minutos. Desligue o fogo, sirva!");
                break;


            case "Escondidinho de Cará e carne moída":
                Ingredientes.setText("- 1 kg de inhame (cará) cozido e passado no espremedor\n- 2 ovo crus\n- 2 colheres (sopa) de margarina\n- 1 xícara (chá) de leite\n- 3 clara de ovo batidas em neve\n- 1 colher (sobremesa) de fermento químico\n- 500 gramas de patinho moído\n- 3 colheres (sopa) de óleo\n- 1 cebola picada\n- 2 dentes de alho picados\n- 2 tomate maduros sem pele e sem sementes picados\n- 1/2 xícara (chá) de azeitona verde picadas\n- 3 ovo cozidos e picados\n- 1 gema de ovo para pincelar\n- sal a gosto\n- pimenta a gosto\n- queijo parmesão ralado para polvilhar");
                Preparo.setText("Em uma panela, misture o cará, os ovos, a margarina, o leite e o sal. Leve ao fogo brando (160 ºC), mexendo sempre até misturar todos os ingredientes. Desligue o fogo e deixe esfriar, misture o fermento em pó e as claras. Reserve a massa e faça o recheio. Em uma panela, aqueça o óleo e refogue a carne até secar. Acrescente a cebola, o alho, o tomate e refogue até dourar. Junte o sal, a pimenta, as azeitonas e os ovos. Desligue o fogo e deixe esfriar. Em um refratário untado com margarina, coloque metade da massa, a carne por cima e cubra com o restante da massa. Pincele a gema, salpique o queijo e asse no forno, preaquecido, a 200 ºC até dourar.");
                break;
            case "Pudim de Cará":
                Ingredientes.setText("- 200 gramas de Cará cozido e sem sal\n- 2 colheres de sopa de amido de milho\n- 4 xícaras de chá de leite integral\n- 2 colheres de sopa de margarina\n- 1 xícara de chá de açúcar\n- 1 colher de chá de essência de baunilha\n- 1 lata de leite condensado\n- 4 ovos inteiros\n- 1 pitada de sal\n- 50 gramas de coco ralado fino (opcional)");
                Preparo.setText("Calda2 xícaras de chá de açúcar, leve ao fogo até derreter por completo e acrescente 2 xícaras e meia de chá de água, mexendo rapido até que se torne uma calda lisa. PudimBata tudo no liquidificador de 5 a 8 minutos ate que a massa fique homogênea. Após ser batido despeje em uma forma de pudim caramelizada. Leve ao forno pré-aquecido (280º) em banho maria por aproximadamente 1h30min (ou ate que ao enfiar o palito ele saia limpo). Retire do forno, deixe-o esfriar e o leve a geladeira por 2h(duas horas), desenforme e decore.");
                break;
            case "Carne seca com Cará":
                Ingredientes.setText("- 3 tomates maduros picados\n- 3 colheres (sopa) de azeite\n- 3 dentes de alho picados ou 5 g\n- azeitonas sem caroço\n- 500 g de cará descascados\n- 500 g de carne-seca\n- salsinha e coentro a gosto");
                Preparo.setText("Depois de cozinhar a carne seca na panela de pressão, desfie a carne-seca e coloque-a em um recipienteRefogue a cebola, o alho, os tomates, a azeitona a salsinha e o coentro com azeite e misture bemDeixe refogar mais um pouco para incorporar o saborMontagem: Misture a carne-seca com o refogado, coloque o cara em rodelas já cozido em um refratárioEm seguida, coloque a carne seca e seus preparos em cima do cará, sirva bem quenteSe preferir o coentro e salsinha, podem ser salpicados por último");
                break;

            case "Purê de Cará com Bacon":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Cará Assado":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Coxinha de Cará":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Chips de Cará":
                Ingredientes.setText("");
                Preparo.setText("");
                break;
            case "Endívias Gratinadas":
                Ingredientes.setText("- 4 endívias grandes\n- 2 colheres de sopa de sal\n- 8 fatias de presunto\n- 1 cebola pequena picada\n- 500 ml de leite\n- 1 xícara de água\n- 1 colher de sopa de manteiga\n- 1 cubo de caldo de carne ou galinha\n- 1 pitada de noz-moscada ralada\n- 50 g de queijo ralado\n- 2 colheres de amido de milho");
                Preparo.setText("Corte as endívias ao meio e retire o talo inferior com uma faca (o bumbum da endívia). Ferva 1 litro de água com 2 colheres de sopa de sal e colque as endívias para cozinhar por 10 minutos. Escorra e reserve. MOLHO BRANCO: Refogue a cebola picada na manteiga até dourar. Dilua o amido de milho em 1 xícara de água, e despeje na panela junto da cebola. Acrescente o leite o cubo de caldo de galinha ou carne, a noz-moscada e 25 g de queijo ralado. Mexa sempre, em fogo baixo até engrossar. À parte, enrole cada fatia de presunto em uma metade de endívia cozida, com cuidado para não desmanchar. Coloque-as numa travessa refratária e despeje o molho branco por cima. O restante do queijo ralado polvilhe sobre o molho. Leve ao forno pré-aquecido, à 200°C até gratinar.");
                break;
            case "Salada de Endívias com cream cheese":
                Ingredientes.setText("- 50 gr de cebolinha verde picada\n- 40 gr de nozes\n- 100 gr de damasco seco\n- 200 ml de leite integral\n- 100 ml de creme de leite\n- 240 gr de cream cheese\n- 4 unidades de endívia (inteiras)\n- 4 colheres (sopa) de suco de limão");
                Preparo.setText("Misture o cream cheese, o creme de leite e o leite em um recipiente. Adicione o suco de limão e misture. Tempere com sal e pimenta. Fatie a endívia e adicione as nozes e o damasco seco. Em outro recipiente, misture a endívia, o molho e finalize com cebolinha francesa e um fio de azeite.");
                break;

            case "Endívia Recheada":
                Ingredientes.setText("- 400g de peito de frango\n- 2 colher de sopa de margarina\n- 1 e ½ xícara de maionese light\n- 3 pimentas dedo-de-moça\n- Suco de 2 limões\n- 1 maço de salsinha\n- 4 endívias\n- Sal\n- 1 xícara de amendoim torrado");
                Preparo.setText("Em uma tábua, corte as pimentas ao meio, retire as sementes e corte cada metade em cubinhos pequenos. Corte o peito de frango em bifes. Reparta cada bife em tiras finas e corte-as em cubinhos. Em uma frigideira, aqueça a manteiga em fogo médio e refogue o peito de frango picado até dourá-lo. Acrescente a pimenta, a salsinha, o suco de limão e sal a gosto. Junte a maionese e leve à geladeira até servir. Separe as folhas das endívias e lave-as em água corrente. Seque-as com papel absorvente. Recheie cada folha com o frango e decore com os amendoins, distribuindo-os sobre o recheio. Sirva como canapé.");
                break;


            case "Endívias ao Forno":
                Ingredientes.setText("- 8 endívias pequenas\n- 200 g de queijo mozarela\n- 4 fatias de fiambre\n- 50 ml de Azeite\n- c. (de sopa) de cebolinho picado\n- sal q.b.\n- pimenta q.b.");
                Preparo.setText("Arranje as endívias e faça um corte no sentido do comprimento. Corte o queijo mozarela em pedaços. Tempere as endívias com sal e pimenta e coloque, dentro de cada uma, um pouco de queijo. Envolva com uma fatia de fiambre e coloque num recipiente refratário. Regue com o azeite e leve a meio do forno a 180º C, por 20 minutos. Retire e sirva-as polvilhadas com o cebolinho picado.");
                break;

            case "Macarrão com pesto de Rúcula, hortelã e Gorgonzola":
                Ingredientes.setText("- 500g de espaguete\n- 30g de folhas de rúcula\n- 15g de folhas de hortelã\n- 60g de nozes\n- 1 cebola mini picada\n- 120 ml de azeite\n- 1 colher (sopa) de suco de limão e as raspas da casca\n- 2 colheres (sopa) de queijo gorgonzola\n- Sal e pimenta-do-reino a gosto");
                Preparo.setText("Lave e seque bem as folhas e ponha num processador (ou no pilão, para ser mais tradicional). Toste as nozes (passe rapidamente por uma frigideira aquecida, para soltar o sabor). Ponha as nozes no processador. Pique a cebola, ponha no processador. Junte o queijo, esfarelando com os dedos, o suco e as raspas de limão. Despeje o azeite e bata até formar um creme espesso. Tempere com sal e pimenta-do-reino moída na hora. Cozinhe o espaguete, até estar macio e firme. Escorra, ponha na vasilha de servir com uma concha de água do cozimento. Misture o pesto frio à massa e sirva em seguida.");
                break;

            case "Crepioca de Frango e Rúcula":
                Ingredientes.setText("- 1 colher (sopa) de óleo\n- meia cebola pequena picada\n- 2 xícaras (chá) de frango cozido e desfiado (160 g)\n- 1 tomate médio sem sementes, picado\n- 1 sachê de caldo de legumes\n- 5 ovos \n- 1 e meia xícara (chá) de goma pronta para tapioca\n- folhas de meio pé de rúcula");
                Preparo.setText("Coloque o óleo em uma panela média e leve ao fogo alto para aquecer. Junte a cebola e refogue por 3 minutos, ou até dourar. Acrescente o frango, o tomate e metade do sachê de caldo de legumes, mexa e cozinhe por 3 minutos. Retire do fogo e reserve. Prepare a massa: em uma tigela, coloque os ovos, a goma de tapioca e o restante do caldo de legumes, e mexa bem. Coloque meia colher chá de óleo em uma frigideira média e leve ao fogo alto para aquecer. Abaixe o fogo e espalhe 1 concha da massa. Cozinhe por cerca de 1 minuto e vire com o auxílio de uma espátula. Distribua 2 colheres de sopa de frango e meia xícara (chá) de folhas de rúcula, enrole como panqueca e retire do fogo. Repita o processo com o restante da massa e do recheio. Sirva em seguida.");
                break;

            case "Salada defumada de Rúcula e Maçã":
                Ingredientes.setText("- 1 colher de sopa de grãos de mostarda, inteiros\n- 1 colher de sopa de vinagre de sidra\n- 2 colheres de sopa de azeite de oliva extravirgem\n- Sal \n- 1 maçã, cortada ao meio, sem miolo e sem sementes (recomendado: maçã Fuji ou Pink Lady)\n- 140 g de rúcula baby\n- 1/2 xícara de amêndoas defumadas, picadas\n- 1/4 de xícara de ricota seca");
                Preparo.setText("Em uma tigela grande, coloque a mostarda, o vinagre e, usando um batedor de arames (tipo fouet), misture os ingredientes. Regue com o azeite e continue misturando com o fouet, até que o molho esteja emulsificado. Tempere com 1/4 de colher de chá de sal. Usando uma faca ou o mandolim, corte a maçã em meia-lua. Adicione as maçãs ao molho e misture bem. Junte a rúcula, as amêndoas defumadas e 1/4 de colher de chá de sal; misture até revestir. Coloque uma colher cheia de ricota por cima e sirva imediatamente.");
                break;

            case "Tabule de Rúcula":
                Ingredientes.setText("- 150 gramas de trigo para quibe\n- 300 ml de água quente\n- ½ peito de frango\n- rúcula\n- salsinha\n- hortelã\n- tomate cereja\n- 60 gramas de nozes\n- 1 limão\n- [azeite + sal + pimenta]");
                Preparo.setText("Começo hidratando o trigo. Numa tigelinha, coloco o trigo e a água fervente e reservo. Quando o trigo absorver toda a água, ele estará bem macio. Corto o peito de frango em tirinhas e tempero com sal e pimenta. Numa frigideira com um pouco de azeite, douro as tirinhas de frango e reservo. Pico a salsinha. Pico os tomates. Tosto as nozes na frigideira e trituro grosseiramente. Expremo o limão. Numa tigela funda, misturo o trigo, a rúcula, a salsinha, a menta, os tomates e as nozes. Acrescento também o frango. Incorporo o suco de um limão e tempero com sal, pimenta do reino e azeite. E já! Tá prontinha uma salada deliciosa!");
                break;

            case "Molho de Rúcula":
                Ingredientes.setText("- 1 xícara de rúcula\n- ½ xicara de água\n- 1 colher de sopa de suco de limão\n- ½ colher de chá de mel\n- ½ colher de chá de mostarda\n- ½ colher de chá de sal\n- 1 colher de sopa de azeite de oliva");
                Preparo.setText("Bater tudo no liquidificador e sirva.");
                break;

            case "Bolo Cremoso de Tangerina":
                Ingredientes.setText("- 4 ovos (claras e gemas separadas)\n- 1 ¼ xícara (chá) de açúcar\n- ½ xícara (chá) de manteiga em temperatura ambiente\n- 1 colher (sobremesa) de raspas de casca de tangerina\n- 1/1/3 xícara (chá) de farinha de trigo\n- 1 colher (chá) de fermento em pó\n- 5 tangerinas\n- Glacê:\n- 1 clara\n- 10 colheres (sopa) de açúcar\n- 2 colheres (chá) de suco de limão");
                Preparo.setText("Massa: Bata as claras em neve e reserve. Depois, bata as gemas com o açúcar até obter um creme claro. Junte a manteiga a esse creme batendo sem parar. Peneire a farinha de trigo com o fermento e acrescente as raspas de casca de tangerina. Adicione a farinha e as claras reservadas aos poucos alternadamente, misturando bem. Despeje a massa em uma fôrma de aro removível de 22 cm, untada e enfarinhada, e leve para assar em forno preaquecido em temperatura média (180º), por cerca de 35 minutos. Separe alguns gomos de tangerina para a decoração e bata o restante dos gomos no liquidificador. Coe e reserve. Desenforme o bolo ainda quente sobre um prato redondo, deixe amornar e regue com o suco. Glacê: Bata bem a clara com o açúcar e o suco de limão. Espalhe o glacê sobre o bolo e decore com os gomos de tangerina reservados.");
                break;

            case "Cookie de casca de Tangerina":
                Ingredientes.setText("- 50 G DE TANGERINA PONKAN SEM SEMENTES\n- 70 G DE ÓLEO VEGETAL\n- 75 G DE AÇÚCAR DEMERARA\n- 1 COLHER (CAFÉ) DE SAL\n- 110 G DE FARINHA\n- 4 G DE FERMENTO\n- 40 G DE CHOCOLATE MEIO AMARGO PICADO (VEGANOS PODEM USAR CHOCOLATE VEGANO À BASE DE LEITE DE SOJA)\n- 50 G DE CASCA DE TANGERINA CORTADA EM PEDAÇOS PEQUENOS\n- 50 G DE VINAGRE BRANCO \n- 50 G DE AÇÚCAR COMUM\n- 50 G DE ÁGUA\n- 30 G DE SUCO DE LIMÃO");
                Preparo.setText("Colocar numa panela pequena as cascas de tangerina, vinagre, açúcar e águaLevar para ferver em fogo brando por 10 min. E deixe esfriar naturalmenteCoar bem as cascasAdicionar suco de limão nas cascas coadasUsar mixer para triturar bem pedaços de tangerina, óleo, açúcar e salColocar numa vasilha, farinha, fermento e misturar. Adicionar o creme de tangerinaMisturar bem com uma colher. Adicionar as cascas com suco de limão e chocolate e misturarUntar uma formaColocar a massa com colher. A massa deve ter 2 dedos de diâmetro e ter espaço entre elas de pelo menos 3 dedosLevar para assar no forno preaquecido a 150 grausAssar por 20-15 min. Até dourar a beirada do cookieRetirar os cookies ainda quente, que devem estar moles e colocar numa grade para esfriarGuardar num recipiente de vidro bem tampado");
                break;

            case "Pudim de Tangerina":
                Ingredientes.setText("- Pudim:\n- 1 lata de leite condensado\n- a mesma medida de suco de tangerina coado\n- raspas de 3 tangerinas pequenas\n- 3 ovos\n- Calda:\n- ½ xícara de açúcar");
                Preparo.setText("Calda: Coloque o açúcar na forma. Posicione a forma na chama baixa do fogão (vá girando a forma aos poucos, espalhando com uma espátula ou colher de cabo comprido – utilize uma luva protetora para não queimar a mão que segura a forma). Quando o açúcar estiver totalmente derretido, apague o fogo e faça movimentos circulares na forma para espalhar a calda no fundo e o início das bordas. Reserve, enquanto bate o pudim. Pudim Pré-aqueça o forno a 170 °C. Ferva água o suficiente para completar 1 cm de altura de uma assadeira retangular um pouco maior do que a forma na qual o pudim será assado, para fazê-lo em banho-maria. No liquidificador coloque todos os ingredientes e bata somente até misturar. Retire com uma concha a espuma excessiva que ficará na superfície. Despeje a mistura na forma preparada com o caramelo. Coloque essa forma dentro de uma assadeira um pouco maior. Despeje a água fervente e com cuidado (mãos protegidas por luvas térmicas), leve ao forno por cerca de 45 minutos ou até enfiar uma faquinha e sair limpa. Deixe o pudim resfriar em temperatura ambiente e leve à geladeira até ficar bem gelado.");
                break;

            case "Frango ao molho de Tangerina":
                Ingredientes.setText("- 1 kg de filé de peito de frango com pele;\n- 2 dentes de alho amassados;\n- Raspas da casca de 1 tangerina;\n- 1 limão espremido;\n- Sal e pimenta-do-reino a gosto;\n- 150 ml de suco de tangerina;\n- 1/2 xícara (chá) de água;\n- 1 ramo de alecrim fresco para decorar.");
                Preparo.setText("Faça uma marinada para o frango misturando numa vasilha o alho, as rapas de tangerina, o suco de limão e sal e pimenta. Deixe os filés pegarem gosto por meia hora. Arrume os pedaços numa assadeira – deixe a pele para cima –, espalhe o tempero por cima deles e leve, cobertos com papel-alumínio, ao forno preaquecido a temperatura média. Quando já estiverem quase prontos, retire o papel-alumínio e deixe até a pele ficar bem dourada. Para o molho, deglaceie o que ficou dentro da assadeira com o suco de tangerina e a água. Deixe reduzir um pouco e retire. Para servir, fatie os pedaços, despeje o molho por cima e decore com gomos de tangerina e de alecrim fresco. Sirva com Arroz Branco.");
                break;

            case "Salada de Folhas verdes com Tangerina":
                Ingredientes.setText("- 1 pé pequeno de alface mimosa\n- 1 pé pequeno de alface romana\n- 2 xícaras (chá) de agrião\n- 2 tangerinas descascadas, separadas em gomos, sem a película transparente\n- Molho\n- ¼ de xícara (chá) de azeite\n- 1 colher (sopa) de mostarda\n- 1 colher (sopa) de mel\n- Suco de 1 limão ou de 1 tangerina\n- Sal a gosto");
                Preparo.setText("Lave as folhas, seque para retirar o excesso de água e arrume-as em taças individuais ou em uma travessa grande. Corte as extremidades das tangerinas e descasque-as, usando uma faca pequena bem afiada. Retire toda a pele branca e corte os gomos, separando entre cada membrana. Junte os gomos de tangerina na salada e reserve coberta com filme plástico na geladeira. Na hora de servir, misture todos os ingredientes do molho e tempere a salada. Sirva em seguida.");
                break;

            case "Salmão ao molho de Tangerina":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Casquinha Cristalizada de Mexerica":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Bolo de Mexerica":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Mousse de Tangerina":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Bolo de Mexerica com Cachaça":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Geleia de Tangerina":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

            case "Frango Assado ao Molho de Tangerina":
                Ingredientes.setText("");
                Preparo.setText("");
                break;

                case "Canjica Vegana":
                    Ingredientes.setText("- 1 xícara (de chá) de canjica crua (canjica de milho)\n- 500ml de leite de amendoim (Veja como fazer aqui)\n- 1 xícara (de chá) de açúcar demerara ou cristal\n- 5 unidades de cravo-da-Índia (ou anis estrelado)\n- 1 unidade de canela em pau\n- 1/4 de xícara (de chá) de coco ralado seco\n- 1 colher (de sopa) de farinha de trigo ou amido de milho misturada em 1/4 de xícara (de chá) de água\n- 1/2 xícara (de chá) de leite de coco\n- Canela em pó\n- Resíduos de leite de amêndoas/amendoim ou paçoca esfarelada");

                    Preparo.setText("Coloque a canjica em uma vasilha, cubra com o dobro de água e deixe de molho por 12 horas. Escorra, lave e coloque em uma panela de pressão juntamente com 1 litro de água. Deixe cozinhar em fogo médio por 30 minutos depois que pegar pressão e desligue. Caso ainda não estiver macio, deixe cozinhar por mais tempo. Adicione o leite de amendoim, o açúcar, os cravos-da-Índia, a canela, o coco ralado seco e deixe ferver. Quando estiver fervendo, adicione a farinha (ou amido de milho) misturada com a água, misture e deixe engrossar. Em seguida, acrescente o leite de coco, misture e desligue. Sirva quente ou gelado, com canela em pó salpicada por cima. Você pode salpicar também os resíduos do leite de amendoim torrados ou paçoca esfarelada.");
                    break;

                case "Sorvete De Canjica":
                    Ingredientes.setText("- 200g de canjica cozida (sem o caldo onde foi cozida)\n- 200ml de leite de coco\n- 1 colher de chá de canela\n- 1 lata de leite condensado\n- 100ml de creme de leite gelado ");

                    Preparo.setText("Junte a canjica cozida com o leite de coco e a canela e leve ao fogo, fervendo por 5 minutos. Com o leite fervido, processe a canjica até que forme um creme, sem pedaços grandes, e adicione o leite condensado. (Eu usei um hand mixer diretamente na panela, mas se não tiver, o liquidificador dá conta do recado. Basta adicionar o leite condensado aos poucos e bater na opção “pulsar”). Leve para o congelador até ficar completamente congelado (o tempo vai variar de acordo com a temperatura do congelador, mas será cerca de 6 horas). Depois de congelado, leve ele ao liquidificador com o creme de leite e bata até virar creme. Sirva com canela ou amendoim moído.");
                    break;

                case "Canjica Temperada Com Limão E Lavanda":
                    Ingredientes.setText("- 500 g de milho branco para canjica\n- Casca de 1 limão (somente a parte verde)\n- 1 colher de chá rasa de lavanda\n- 500 ml de leite\n- 600 ml de leite de coco\n- 2 latas de leite condensado\n- Raspas de limão a gosto para servir ");

                    Preparo.setText("Deixe o milho de molho de véspera. Escorra e descarte a água. Leve o milho para cozinhar em panela de pressão coberto com água, com a lavanda e cascas do limão. Cozinhe por mais ou menos 40 minutos após a panela chiar, e até que o milho esteja bem macio. Prove!Com a panela de pressão aberta, adicione os outros ingredientes e deixe cozinhando por 20 minutos para que engrosse a gosto e o sabor fique mais apurado. Adicione mais açúcar se achar necessário. Retire a casca de limão e ao servir salpique mais raspas se quiser. Dicas / Substituições: Você pode usar casca de laranja, tangerina ou de outra fruta cítrica a gosto. A lavanda é opcional, Mas recomendo.");
                    break;


                case "Canjica Doce Com Leite Condensado":
                    Ingredientes.setText("- Canjica: 250 g\n- Leite: 1 litro(s)\n- Leite condensado: 1 lata(s)\n- Creme de leite: 1 caixinha\n- Amendoim, tostado, sem pele: 2 xíc. (chá)\n- Canela em pau: a gosto");

                    Preparo.setText("Coloque a canjica em uma tigela e cubra com água. Deixe descansar de um dia para o outro. Escorra e transfira para uma panela de pressão. Cubra a canjica com água e cozinhe por 20 minutos, depois de pegar pressão. Espere a pressão sair sozinha, abra a panela e acrescente o leite, o leite condensado e a canela em pau à panela de pressão e cozinhe por mais10 minutos. Enquanto a canjica cozinha, triture o amendoim torrado. Quando a canjica estiver pronta, desligue o fogo, acrescente o amendoim e o creme de leite. Mexa bem. Sirva em seguida. Se preferir, polvilhe canela em pó por cima. NOTA: Você pode substituir o amendoim por coco ralado e o creme de leite por leite de coco.");
                    break;

                case "Canjica Doce":
                    Ingredientes.setText("- 500g de milho para canjica\n- cravo e canela em pau a gosto\n- 0.5 xícara de chá de açúcar\n- 1l de leite\n- 1 lata de leite condensado (395 g)\n- 500ml de leite de coco\n- coco ralado a gosto.");

                    Preparo.setText("Deixe a canjica de molho por 4 horasDepois desse tempo, escorra a água e coloque a canjica numa panela de pressão, cubra totalmente com água (4 dedos acima da canjica)Adicione o cravo, a canela em pau, o açúcarLeve ao fogo médio e deixe por 30 minutos após pegar pressãoApague o fogo, retire a pressão, adicione o leite, o leite condensado, o leite de coco, o coco raladoFerva e em fogo baixo até reduzir o líquido pela metade e a canjica ficar cremosa (+/- 10 minutos)Apague o fogo deixe esfriar e sirva.");
                    break;

                case "Torta Cremosa De Chicória":
                    Ingredientes.setText("- 2 pés de chicória\n- 2 unidades de cebola\n- 1 pitada de orégano\n- 2 colheres (sopa) de vinagre\n- 13 colheres (sopa) de farinha de trigo\n- 3 unidades de ovo\n- 1/2 copo de óleo\n- 4 copos de leite desnatado\n- 1 colher (sopa) de fermento químico em pó\n- sal a gosto");

                    Preparo.setText("Lave bem as folhas de chicória, escorra e pique-as bem fininhos. Corte a cebola em rodelas finas. Misture a chicória com a cebola e tempere com sal, orégano e vinagre, e reserve. Bata no liquidificador a farinha de trigo com os ovos, o óleo, o sal, o leite e o fermento. Espalhe a chicória em um refratário untado e cubra com a massa batida. Leve a torta ao forno médio (170 °C a 190 °C), preaquecido, por 40 minutos aproximadamente. Sirva morna ou fria.");
                    break;

                case "Salada De Chicória Light Com Frango":
                    Ingredientes.setText("- 150 gramas de frango em cubos;\n- suco de 1 limão;\n- sal a gosto;\n- pimenta a gosto;\n- 1 colher de sopa de azeite de oliva;\n- 1 maço de chicória picado. \n Tempere o frango em cubos com limão, sal e pimenta. Leve para refogar em uma frigideira com azeite. Quando estiver douradinho, reserve. Lave a chicória, pique e misture com o frango. Adicione mais azeite e acerte sal e pimenta. Sirva.");

                    Preparo.setText("Tempere o frango em cubos com limão, sal e pimenta. Leve para refogar em uma frigideira com azeite. Quando estiver douradinho, reserve. Lave a chicória, pique e misture com o frango. Adicione mais azeite e acerte sal e pimenta. Sirva.");
                    break;

                case "Salada De Chicória Light Com Abobrinha":
                    Ingredientes.setText("- 1 abobrinha cortada em rodelas;\n- 1 maço de chicória lavado e picado;\n- 1 dente de alho picado;\n- azeite de oliva a gosto;\n- sal a gosto;\n- pimenta a gosto. ");

                    Preparo.setText("Lave a chicória, pique e reserve. Leve as rodelas de abobrinha para grelhar em uma frigideira com azeite e alho. Tempere com sal e pimenta. Adicione a chicória, dê uma leve refogada e sirva em seguida como acompanhamento de alguma proteína.");
                    break;

                case "Salada De Chicória Light Com Tomate":
                    Ingredientes.setText("- 3 pés de chicória;\n- 1 rodela de cebola;\n- 3 tomates grandes;\n- 2 colheres de sopa de azeite;\n- 2 colheres de sopa de vinagre branco;\n- sal a gosto;\n- 1 colher de chá de pimenta-do-reino branca. ");

                    Preparo.setText("Corte a chicória em tirinhas e deixe de molho em água com uma rodela de cebola por cerca de duas horas. Passado esse tempo escorra e coloque as folhas nas bordas do prato. Corte os tomates em fatias e coloque no centro do prato. A parte misture azeite, vinagre e tempere com sal e pimenta. Regue a salada e sirva.");
                    break;

                case "Salada De Chicória Light Com Damasco E Nozes":
                    Ingredientes.setText("- 50 g de nozes picadas;\n- 1 xícara de damascos sem calda picados;\n- 100 g de queijo roquefort;\n- sal a gosto;\n- pimenta do reino branca a gosto;\n- 500 g de chicoria;\n- 1 cabeça de radicchio. ");

                    Preparo.setText("Pique as nozes e leve ao forno para dourar rapidamente. Escorra os damascos. Pique o queijo. Retire as folhas externas das chicórias e radicchio, lave bem e coloque as folhas cortadas ao meio em uma saladeira. Incorpore os damascos e o queijo por cima. Finalize com as nozes e tempere com sal e pimenta a gosto. Sirva!");
                    break;


                case "Costelinha De Porco Com Moranga Caramelizada E Abobrinha":
                    Ingredientes.setText("- 500 g de costelinha de porco\n- 50 ml de aceto balsâmico\n- 6 colheres (sopa) de açúcar\n- 4 tomates\n- 3 dentes de alho\n- 1 abóbora moranga\n- 1 abobrinha\n- 1 cebola roxa\n- 1 limão");

                    Preparo.setText("Sele a costelinha de porco. Reserve. Descasque a cebola roxa, três dentes de alho e quatro tomates médios. Adicione a costelinha e coloque na panela de pressão por 20 minutos. Descasque a moranga, corte em gominhos, espalhe no fundo da panela e acrescente água até a metade do recipiente. Não deixe cozinhar totalmente. Na sequência, adicione cinco colheres de açúcar. Quando secar o restante da água, o açúcar irá caramelizar a abóbora. Corte uma abobrinha em brunoise, dê um susto colocando na água quente e na água fria logo depois. A água precisa estar salgada, tempere com limão. Faça uma redução com 50ml de alceto balsâmico e uma colher de sopa de açúcar. Sirva as costelinhas com molho, a moranga cortada em meia lua, o picadinho de abóbora e puxe um risco com a redução.");
                    break;

                case "Docinho De Abóbora Moranga":
                    Ingredientes.setText("- 1 lata de leite condensado Mococa\n- 250 gramas de abóbora (tipo moranga de casca verde) cozida, bem escorrida e amassada\n- 1 colher (café) de manteiga Mococa\n- Granulado laranja para passar");

                    Preparo.setText("Misture a abóbora tipo moranga bem amassada (purê) com o leite condensado e manteiga e leve ao fogo, mexendo sempre até começar a soltar da panela. Deixe esfriar e faça bolinhas, passe pelo confeito laranja.");
                    break;

                case "Camarão Na Moranga (Prático E Delicioso)":
                    Ingredientes.setText("- 1 abóbora moranga\n- 500 g de camarão (fresco ou congelado)\n- 2 colheres (de sopa) de azeite de oliva\n- ½ cebola ralada\n- 2 dentes de alho amassados\n- 2 tomates bem picadinhos\n- Pimenta do reino (moída na hora) a gosto\n- Sal a gosto\n- 1 caixinha de creme de leite de 200 g\n- 1 copo de requeijão cremoso de 200 g\n- 3 fatias de muçarela. \n ");

                    Preparo.setText("Preparando a abóbora: Lave a abóbora moranga e enrole em papel alumínio. Leve ao forno médio até ela ficar cozida. A minha ficou cerca de 40 minutos. Espete um garfo para ver se ela está macia. Depois retire do forno, tire o papel alumínio e corte a “tampa” dela com uma faquinha. Com uma colher, retire todas as sementes e os fiapos e jogue fora. Polvilhe sal em toda a cavidade da abóbora e reserve. Preparando o creme de camarão: A primeira coisa é limpar os camarões (claro se é que você não comprou limpo como eu), tire a cabeça, as cascas, as perninhas e abra nas costas dele com uma faca para tirar o intestino. Reserve uns camarões inteiros para a decoração. Em uma panela coloque o azeite, o alho amassado e a cebola ralada e deixe fritar um pouco. Acrescente os tomates picadinhos e frite mais. Tempere com sal e pimenta do reino. Junte os camarões limpos e misture, assim que eles mudarem de cor, já está bom (uns dois minutinhos). Acrescente o creme de leite, misture e desligue o fogo. Reserve. Montagem do Camarão na Moranga: Espalhe metade do requeijão cremoso pelo interior da abóbora, lambuzando bem. Despeje o creme de camarão dentro da abóbora. Espalhe o restante do requeijão cremoso por cima. Cubra com as fatias de muçarela. Leve ao forno alto para gratinar (ou só para derreter o queijo). Passe os camarões inteiros (reservados para a decoração) em uma frigideira com azeite, tempere com sal e pimenta do reino. Quando o queijo da abóbora derreter, tire do forno, decore com os camarões inteiros e com a tampa da abóbora e sirva quente.");
                    break;

                case "Abóbora Recheada Com Ricota":
                    Ingredientes.setText("- 4 unidades de abóbora moranga (tamanho mini, ou 1 abóbora japonesa grande)\n- 300 gramas de ricota amassada (sugestão: marca Tirolez)\n- 1 colher de sopa de azeite\n- 1 colher de café de sal (colher rasa)\n- 1 colheres de sopa de sálvia picada ");

                    Preparo.setText("Em uma panela com água fervente, cozinhe as abóboras. Quando estiverem macias, retire a “tampa” (não jogue fora) e dispense as sementes. Retire também parte da polpa, reservando. Em um recipiente, coloque a polpa das abóboras, a ricota (sugestão da marca Tirolez) e tempere com azeite, sal e sálvia. Preencha as abóboras com o recheio de ricota e leve-as ao forno para assar por 15 minutos. Sirva.");
                    break;

                case "Frango Cremoso Na Moranga":
                    Ingredientes.setText("- 1 kg de filé de peito em cubos \n- Óleo para grelhar\n- Sal a gosto\n- 1 abóbora moranga grande\n- Papel alumínio\n- 2 colheres (sopa) de azeite extra virgem\n- 1 cebola picada\n- 2 dentes de alho picados\n- 2 colheres (sopa) de extrato de tomate\n- 4 tomates sem pele e sem sementes cortados em cubos\n- 1 pimenta dedo de moça sem sementes cortada em cubos\n- 1 caixinha de creme de leite (200 ml)\n- 4 colheres (sopa) de salsinha e cebolinha verde picada\n- 250 g de requeijão cremoso\n- Sal a gosto");

                    Preparo.setText("Preaqueça o forno a 180°C. Corte a tampa da abóbora moranga e retire todas as sementes. Embrulhe a moranga com papel alumínio (pelo menos 3 camadas com o lado brilhante para dentro) e leve ao forno por 40 minutos. Aqueça uma panela com o óleo e doure os cubos de frango. Depois que estiverem bem dourados, transfira-os para um recipiente e tempere com sal. Na mesma panela que dourou os cubos de frango, adicione o azeite e refogue a cebola e o alho. Junte o extrato de tomates, os tomates, a pimenta e o frango em cubos e cozinhe em fogo baixo e com a panela tampada por 15 minutos. Retire a moranga do forno e, com cuidado, retire um pouco da polpa. Misture a polpa no creme de frango e cozinhe por mais 2 minutos. Junte o creme de leite, o cheiro verde e metade do requeijão cremoso. Espalhe o restante do requeijão cremoso no interior da moranga e recheie-a com o creme de frango. Leve ao forno (180°C) por mais 15 minutos antes de servir.");
                    break;


                case "Sopa De Mandioquinha Com Carne":
                    Ingredientes.setText("- 1 kg de mandioquinha descascadas e cortadas em 4 pedaços\n- 3 cenouras médias em cubos de 1 centímetro\n- 100 g de vagem fatiadas em rodelinhas\n- 2 astes de salsão fatiadas\n- 1 cebola média em cubos pequenos\n- 2 dentes de alho em cubos pequenos ou amassado\n- 250 g de carne moída\n- 1 lata de tomate pelado ou 3 tomates sem sementes em cubos pequenos\n- 1 colher (de café) de cúrcuma (açafrão da terra),\n- 1 colher (de sopa) de manteiga\n- Cheiro verde sal, azeite e pimenta. ");

                    Preparo.setText("Coloque um caldeirão com água salgada no fogo,Assim que a água ferver adicione a mandioquinha, os cubinhos de cenoura e a vagem,Assim que a água voltar a borbulhar conte 5 minutos e com a ajuda de uma escumadeira, retire metade dos cubinhos de cenoura e a vagem (não se preocupe em retirar exatamente metade da cenoura, parte vamos processar com a mandioquinha e parte usaremos na carne moída) e reserve,Aqueça uma frigideira, coloque um fio de azeite e assim que estiver quente junte a cebola até ficar transparente, na sequência adicione as fatias de salsão, refogue um pouco mais, separe metade em um potinho para adicionar a mandioquinha depois e adicione a carne moída, refogue até perder o tom cor de rosa, tempere com sal e pimenta, adicione o alho, a cenoura e a vagem que separamos,Acrescente o tomate pelado desmanchando o tomate com a carne, se seu molho estiver muito sequinho com o auxílio de uma concha pegue um pouco a água do cozimento da mandioquinha e regue, deixe cozinhar a carne moída por mais 20 minutos em fogo baixo,Verifique o cozimento da mandioquinha espetando um garfo em um pedaço grande dela, se estiver macia desligue o fogo, separe 500 ml da água do cozimento e escorra a mandioquinha e o que restou da cenoura,Transfira para um bowl a mandioquinha, a cenoura, a cebola e o salsão reservados, a manteiga e a cúrcuma, com a ajuda de um mixer processe e se achar necessário adicione um pouco de água até chegar ao ponto que você prefere ( adicione pouca água se prefere uma sopa creme e mais se prefere uma sopa mais ralinha, lembre-se de sempre fazer isso aos poucos e enquanto processa com o mixer para não perder a textura desejada),Verifique o sal e a pimenta do seu caldo de mandioquinha, sirva o caldo acompanhado (ou misturado) da carne moída com legumes e cheiro verde.");
                    break;

                case "Escondidinho De Frango Com Purê De Mandioquinha":
                    Ingredientes.setText("- 1 kg de filezinho de peito \n- 500 ml de água\n- 2 colheres (sopa) de azeite de oliva extra virgem\n- 1 cebola cortada em cubos\n- 2 dentes de alho picados\n- 3 tomates sem pele e sem sementes cortados em cubos\n- 1 colher (sopa) de farinha de trigo\n- 300 ml de leite integral\n- ½ xícara (chá) de requeijão\n- Sal e pimenta do reino a gosto\n- Purê de mandioquinha\n- ½ xícara (chá) de leite integral\n- 700 g de mandioquinha descascada, cozida e espremida\n- 1 colher (sopa) de manteiga sem sal\n- Noz moscada ralada na hora\n- Sal e pimenta do reino a gosto\n- Óleo para untar\n- ½ xícara (chá) de queijo parmesão ralado fino.");

                    Preparo.setText("Coloque em uma panela de pressão os filezinhos de peito e a água. Cozinhe por 20 minutos a partir do momento que iniciar a pressão. Passados os 20 minutos, desligue o fogo e espere a pressão ceder totalmente. Retire o frango da panela e desfie-o em lascas grandes. Aqueça uma panela e adicione o azeite, a cebola e o alho, refogue por 2 minutos e junte o tomate em cubos, o frango desfiado, a farinha de trigo, o leite e o requeijão. Cozinhe por mais 5 minutos em fogo médio e tempere com sal e pimenta do reino. Reserve. Para o purê, aqueça o leite em uma panela média, adicione a mandioquinha espremida e a manteiga e misture até formar um purê cremoso. Tempere com a noz moscada, sal e a pimenta do reino a gosto. Preaqueça o forno a 220°C e unte um refratário com um fio de óleo e disponha o refogado de frango sobre ele. Cubra com o purê e polvilhe o queijo ralado. Leve ao forno por 20 minutos e sirva em seguida.");
                    break;

                case "Purê De Mandioquinha":
                    Ingredientes.setText("- 500 g de mandioquinha\n- 1 cebola piquena\n- 2 dentes de alho\n- Salsinha picada a gosto\n- 2 colheres (sopa) cheia de manteiga\n- Sal a gosto\n- Pimenta do reino a gosto");

                    Preparo.setText("Descasque e pique a mandioquinha e deixe de molho por alguns minutos. Pique bem o alho e a cebola. Em uma panela média, refogue a cebola e o alho na mantegia até que a cebola fique transparente (não deixe queimar). Desligue o fogo, junte a mandioquinha sem a água (reserve a água para o cozimento), leve em fogo baixo e refogue por alguns minutosAdicione a água e deixe cozinhar por cerca de 10-15 minutos. Depois comece amassar até que fique no ponto que desejado. Pique bem a sasinha ou triture-a, junte ao pure, misture bem e desligue o fogo. Está pronto para servir. DICA: Se preferir um purê mais cremoso, adicione 1/2 xícara de creme de leite.");
                    break;

                case "Mandioquinha Sauté":
                    Ingredientes.setText("- 3 mandioquinhas (cerca de 500g)\n- 2 dentes de alho\n- 3 colheres (sopa) de manteiga\n- 4 ramos de salsinha\n- sal a gosto.");

                    Preparo.setText("Descasque e corte as mandioquinhas em cubos médios de cerca de 2 cm. Transfira para uma panela, cubra com água e leve ao fogo alto. Assim que ferver, diminua o fogo e deixe cozinhar por 15 minutos - espete com um garfo para verificar: a mandioquinha deve estar cozida, mas ainda firme. Descasque e pique fino o alho. Lave, seque e pique fino a salsinha. Assim que estiverem cozidas, escorra as mandioquinhas numa peneira. Numa frigideira, coloque a manteiga e leve ao fogo médio. Assim que derreter, junte as mandioquinhas, tempere com sal e deixe cozinhar por cerca de 10 minutos, mexendo de vez em quando, até começar a dourar. Junte o alho e mexa por mais 2 minutos. Desligue o fogo e misture a salsinha picada. Sirva a seguir.");
                    break;

                case "Creme De Mandioquinha":
                    Ingredientes.setText("- 800 g de mandioquinha picada\n- 1/2 cebola picada\n- 2 dentes de alho picado\n- 100 g de creme de leite (1/2 caixinha)\n- 1,2 L de Água (quente)\n- 13 mL de óleo (1 colher de sopa)\n- sal a gosto\n- salsinha a gosto");

                    Preparo.setText("Coloque o óleo em uma panela e deixe aquecerAcrescente a cebola picada, mexa de vez em quando e deixe até que fique levemente douradaEm seguida adicione o alho e refogue mais um poucoJunte a mandioquinha picada e mexa, deixe refogar por uns 2 minutinhosAcrescente a água e um pouco de sal, misture bem e deixe cozinhar em fogo baixo até amolecer a mandioquinhaAssim que as mandioquinhas estiverem bem cozidas, desligue o fogo e bata o creme com a ajuda de um mixer. Você também pode usar um liquidificador. Assim que estiver homogênea coloque o creme de leite e coloque mais um pouquinho de sal a gostoNa hora de servir decore com um pouquinho de creme de leite e salsinha");
                    break;


                case "Ovo Mexido Cremoso":
                    Ingredientes.setText("- 3 ovos\n- 1 colher de sopa rasa manteiga (cerca de 10 a 12 gramas)\n- Sal a gosto\n- Pimenta a gosto (opcional)");

                    Preparo.setText("Adicionar ingredientes: Em uma panela fria antiaderente, adicione os ovos e a manteigaMexer: ligue o fogo em temperatura bastante baixa, fure a gema dos ovos e mexa sem pararCoagular: Depois de alguns minutos, a misture estará bem líquida. Mais alguns minutos e começaremos a ver o fundo da panela; o ovo começará a coagular. Se estiver coagulando muito rapidamente, retire to fogo por alguns segundos e mexa bemSalgar e finalizar: coloque o sal e retire do fogo um pouco antes de estar no ponto desejado; continue mexendo até que atinja a consitência desejada; o calor da panela continuará a cozinhar o ovoRetirar da panela: retire da panela imediatamente para que os ovos mexidos não fiquem secos; sirva com torradas e manteiga");
                    break;

                case "Ovos Benedict":
                    Ingredientes.setText("- Para o molho holandês:\n- 4 gemas de ovo\n- 1 colher de sopa de suco de limão espremido na hora\n- 1/2 xícara de manteiga sem sal (corte a manteiga em dez pedaços e congele-os)\n- 1 pitada de sal\n- 1 pitada de pimenta\n- Para os ovos benedict:\n- 4 fatias de salmão defumado\n- 2 pães do tipo forma cortados em dois (se não tiver, pode fazer com 4 fatias de outro pão, como o francês)\n- 2 colheres de chá de vinagre branco\n- 4 ovos\n- Sal e pimenta a gosto\n- Molho holandês (receita acima)");

                    Preparo.setText("Faça primeiro o molho holandês. Bata vigorosamente as gemas e o suco de limão em uma tigela de aço inox até a mistura engrossar e dobrar de volume. Coloque a tigela sobre uma panela com água quase fervendo (banho-maria), de modo que a água não encoste no fundo da tigela. Continue batendo rapidamente. Tenha cuidado para não deixar os ovos ficarem quentes demais, senão vão virar ovos mexidos. crescente a manteiga e continue batendo até a manteiga derreter, o molho engrossar e dobrar de volume. Tire do calor, adicione sal e pimenta. Tampe e coloque em um local quente até a hora de usar com os ovos. Se o molho engrossar demais, bata novamente com algumas gotas de água morna antes de servir. Para os ovos, encha uma frigideira antiaderente de 25 cm até a metade com água. Acrescente vinagre branco à água de cozimento – isso faz com que a clara do ovo cozinhe mais rápido e não se espalhe. Deixe ferver. Quebre um dos ovos em uma tigela pequena, tomando cuidado para não furar a gema. Aproxime cuidadosamente a borda da tigela à água, deixando que um pouco da água escorra para dentro da tigela. Deixe que o ovo escorregue para fora da tigela e vá para dentro da água. Repita rapidamente com os ovos restantes. Diminua o fogo. Cozinhe durante três minutos e meio, até a clara do ovo cozinhar e a gema permanecer mole. Pegue os ovos com uma escumadeira, deixando a água escorrer. Coloque uma fatia de salmão defumado sobre cada metade de pão de forma, seguida por um ovo poché. Tempere com sal e pimenta. Coloque o molho holandês sobre os ovos. Enfeite o prato com salsa.");
                    break;

                case "Arrumadinho De Vegetais Com Ovos":
                    Ingredientes.setText("- 2 colheres (sopa) de óleo\n- 1 cebola em meia-lua\n- 1 chuchu cubos pequenos\n- 2 tomates sem sementes, picados\n- 1 xícara (chá) de couve picada finamente\n- 1 xícara (chá) de brócolis\n- 1 abobrinha média em cubos\n- 4 ovos\n- Sal a gosto ");

                    Preparo.setText("Em uma panela grande ou caçarola, aqueça o óleo e refogue a cebola. Junte o chuchu, o 1 xícara (chá) de água e cozinhe por cerca de 5 minutos em fogo baixo, com a panela tampada. Coloque o restante dos vegetais e refogue, adicione mais meia xícara (chá) de água e cozinhe, com a panela tampada, até que amoleçam levemente, sem deixar que a água seque totalmente. Faça 4 cavidades entre os vegetais e coloque 1 ovo em cada uma das cavidades, com cuidado para que não espalhem. Tampe a panela e deixe cozinhar até que os ovos fiquem firmes (cerca de 8 minutos). Abra a panela e sirva a seguir.");
                    break;

                case "Ovos No Purgatório":
                    Ingredientes.setText("- 2 ovos\n- 1 lata de tomates pelados em cubos (400 g)\n- ¼ de pimentão vermelho\n- ½ cebola\n- 1 dente de alho\n- 1 colher (sopa) de azeite\n- ½ colher (chá) de orégano seco\n- 1 pitada de pimenta calabresa seca\n- sal a gosto ");

                    Preparo.setText("Descasque e pique fino a cebola e o alho. Lave, seque e corte ¼ do pimentão - reserve o restante na geladeira para outra receita. Descarte as sementes e corte em cubos pequenos. Leve uma frigideira de 26 cm de diâmetro ao fogo médio. Quando aquecer, regue com o azeite e junte a cebola e o pimentão. Tempere com uma pitada de sal e refogue por cerca de 4 minutos, até murchar. Junte o alho, tempere com a pimenta calabresa - cuidado para não exagerar, vá aos poucos! - e mexa por mais 1 minuto. Abaixe o fogo, junte o tomate pelado (com o líquido), misture e deixe cozinhar por cerca de 5 minutos, mexendo de vez em quando, até o molho encorpar. Tempere com o orégano, sal e misture bem. Numa tigela pequena, quebre um ovo de cada vez. Com uma espátula, abra duas cavidades no molho e transfira os ovos com cuidado para não estourar a gema. Tempere cada um com uma pitada de sal e deixe cozinhar em fogo baixo por 5 minutos. Tampe a frigideira e deixe cozinhar por mais 3 minutos, até que as claras fiquem cozidas e as gemas permaneçam moles (se preferir as gemas cozidas, deixe cozinhar por mais tempo). Sirva a seguir com pão italiano.");

                    break;

                case "Ovos Gratinados":
                    Ingredientes.setText("- 4 ovo cozidos em rodelas\n- 2 xícaras (chá) de leite\n- 2 colheres (sopa) de amido de milho\n- 2 colheres (sopa) de margarina\n- 1/2 xícara (chá) de presunto picadinho\n- 1 colher (sopa) de queijo ralado\n- pimenta-do-reino a gosto.");

                    Preparo.setText("Leve ao fogo o leite com o amido de milho mexendo até engrossar. Retire do fogo, acrescente a margarina, o sal e a pimenta a gosto, assim como o presunto picadinho. Coloque as rodelas de ovos numa forma refratária, cubra com o molho e polvilhe com o queijo. Leve ao forno médio por 10 minutos. Sirva quente.");

                    break;


                case "Morango Frito No Palito":
                    Ingredientes.setText("- 300g de chocolate meio amargo picado\n- 1 colher de sopa de óleo de coco\n- 300g de morangos\n- 1 xícara de farinha de trigo\n- 1 ovo\n- 1 xícara de leite \n");

                    Preparo.setText("Em banho maria, derreter o chocolate. 2.        Juntar o óleo de coco. Reservar. Com o auxílio de um palito, mergulhar os morangos no chocolate. Levar ao congelador por 1 hora. Em um recipiente, misturar bem a farinha, o ovo e o leite. Mergulhar os morangos congelados nessa mistura e fritar em óleo quente. Finalizar com açúcar de confeiteiro.");

                    break;

                case "Cheesecake De Morango":
                    Ingredientes.setText("- Massa:\n- 1 pacote de biscoito maisena\n- 100g de manteiga em temperatura ambiente\n- ½ xícara (chá) de açúcar\n- 2 colheres (sopa) de chocolate em pó\n- Recheio:\n- 3 ovos\n- 2 potes de cream cheese\n- 1 lata de leite condensado\n- Cobertura:\n- 120 g de morango\n- ¾ de xícara (chá) de açúcar\n- Caldo de ½ limão\n- Morangos para decorar");

                    Preparo.setText("Massa: Coloque os biscoitos no liquidificador e bata até obter uma farofa. Transfira para um recipiente, junte a manteiga, o açúcar, e o chocolate em pó e misture bem até formar uma bola de massa. Forre o fundo de uma fôrma de aro removível com a massa, apertando com os dedos. Reserve. RecheioNo liquidificador, bata os ovos, o cream cheese e o leite condensado, até obter um creme homogêneo. Distribua o creme sobre a massa e leve ao forno médio (180°C), preaquecido, por 30 minutos ou até que o recheio fique firme. Deixe esfriar. CoberturaLave os morangos sob água corrente. Retire as folhas e reserve. Acrescente os morangos em uma panela e leve ao fogo baixo e deixe cozinhar por 8 minutos ou até que fiquem macios. Retire do fogo e transfira para o liquidificador. Bata por 20 segundos na velocidade média. Coloque a mistura na mesma panela, acrescente o açúcar e leve ao fogo baixo por 10 minutos. Junte o suco de limão e deixe cozinhar por mais 8 minutos. Retire do fogo e leve para a geladeira. Na hora de servir, espalhe a geleia sobre a cheesecake e decore com os morangos cortados ao meio.");

                    break;


                case "Bombom De Travessa De Morango":
                    Ingredientes.setText("- 4 latas de leite condensado\n- 4 caixas de creme de leite\n- 3 caixas de morangos lavados e cortados ao meio\n- 450 gramas de chocolate amargo ou ao leite picado\n- 100 gramas de chocolate branco picado\n- 50 gramas de manteiga.");

                    Preparo.setText("Creme brancoEm uma panela, adicione o leite condensado, o chocolate branco e a manteiga. Mexa até ficar em ponto de brigadeiro mole. Em seguida, adicione duas caixas de creme de leite. Misture bem até ficar homogêneo. Reserve. Ganache de chocolateNo micro-ondas, derreta o chocolate, aquecendo-o de 30 em 30 segundos e mexendo bem a cada pausa (isso evita que o chocolate queime). Em seguida, adicione duas caixinhas de creme de leite e mexa até a mistura ficar homogênea e brilhante. Montagem Forre uma travessa com os morangos lavados e cortados na metade. Adicione o creme branco por cima, cobrindo os morangos completamente. Cubra tudo com a ganache de chocolate. ");
                    break;

                case "Pavê De Morangos":
                    Ingredientes.setText("- Massa:\n- 1 pacote de biscoito de maizena\n- 2 colheres de margarina\n- Creme:\n- 1 lata de leite condensado\n- 2 gemas\n- 2 colheres de maizena\n- 2 copos de leite (500 ml )\n- Para decorar:\n- 2 caixas de morango\n- 1 caixa de creme de leite\n- 1 barra de chocolate (de sua preferência) \n");

                    Preparo.setText("Massa: Quebre os biscoitos e bata-os no liquidificador até formar uma farinha, junte a margarina, e forme uma massa tipo de empadãoColoque em um pirex ou tabuleiro e reserveCreme: Em uma panela misture os igredientes até dissolver a maizena e as gemasDepois leve ao fogo baixo, mexa até engrossar o creme, se preferir coloque mais leite até obter um creme consistenteColoque o creme sobre a massa e leve ao forno por 6 minutos para dourar a massaDepois espere esfriarPara Decorar: Coloque o creme de leite no pavê e rale uma barra de chocolate de sua preferência, depois coloque os morangos cortados ao meio, leve à geladeira por alguns minutos.");

                    break;

                case "Bolo De Morango Low Carb":
                    Ingredientes.setText("- 1 colher (sopa) de farinha de coco\n- 1 colher (sopa) leite em pó\n- 1 colher (sobremesa) de gelatina zero de morango\n- 1 colher (sopa) de aveia\n- 1 clara \n ");

                    Preparo.setText("Bata a clara a ponto de neve. Separadamente dissolva a gelatina no leite, acrescente a farinha de coco e a aveia, misture bem, em seguida acrescente a clara e bata tudo ate formar uma massa cremosa. Despeje dentro de um travessa que possa ir ao micro-ondas, asse em potência alta por 1 minuto e meio no máximo e sirva. Você pode aumentar a quantidade, e fazer no forno dentro de forminhas de cupcake.");

                    break;


                case "Lasanha De Espinafre":
                    Ingredientes.setText("- 1 pacote de massa de lasanha pré-cozida\n- 1 maço de espinafre\n- 1 pimenta-de-cheiro\n- 1 cebola grande\n- 4 dentes de alho\n- 2 colheres (sopa) de farinha de trigo\n- 2 colheres (sopa) de requeijão\n- 2 copos (americanos) de leite\n- 300 g de queijo mussarela\n- sal, pimenta-do-reino e azeite a gosto.");

                    Preparo.setText("Antes de começar a sua receita é importante lembrar de higienizar bem o espinafre. Em seguida, pique suas folhas, dispensando o talo. Reserve. Aqueça uma panela com um pouco de azeite. Adicione a cebola e o alho e refogue até que fiquem levemente dourados. Acrescente o espinafre picado e refogue em fogo médio. Dissolva a farinha de trigo no leite e adicione, aos poucos, ao refogado. Misture bem e cozinhe até que o creme comece a engrossar. Adicione o sal e a pimenta-do-reino e misture bem. Desligue o fogo, acrescente o requeijão e misture bem até dissolver. MontagemEm um refratário grande, coloque um pouco de molho no fundo. Faça uma camada de massa, cubra com molho e queijo mussarela. Repita esse procedimento até chegar ao topo do refratário, finalizando com molho e queijo mussarela. Cubra com um fio de azeite de oliva e salpique pimenta-do-reino a gosto. Leve para assar em forno preaquecido a 200º C até gratinar.");

                    break;

                case "Bolinho De Espinafre E Aveia":
                    Ingredientes.setText("- 1 folha de espinafre picadas\n- 3 colheres (sopa) de queijo parmesão ralado\n- 3 clara de ovo\n- 1 cebola picada\n- 2 dentes de alho picados\n- 3 colheres (sopa) de azeite de oliva\n- 1 xícara (chá) de aveia em flocos finos\n- 1 colher (café) de fermento químico em pó em pó\n- sal a gosto\n- noz-moscada a gosto.");

                    Preparo.setText("Aqueça bem uma frigideira e refogue a cebola e o alho no azeite. Junte o espinafre e refogue-o até murchar e secar a água do fundo da frigideira. Deixe esfriar. Transfira-o para uma tigela, acrescente o restante dos ingredientes e misture bem. Divida a massa em 15 porções iguais e achate-as como um hambúrguer. Aqueça uma frigideira antiaderente e grelhe os bolinhos dos dois lados até dourar. Sirva em seguida.");

                    break;

                case "Torradinha Com Creme De Espinafre E Ovo":
                    Ingredientes.setText("- 3 ou 4 pães franceses amanhecidos (evite os muito inflados, com pouco miolo, pode ser baguete)\n- 1/2 maço de espinafre\n- 3 ovos\n- 1/4 de xícara de leite\n- 1/4 de xícara de creme de leite fresco\n- 2 cebolas pequenas\n- 4 colheres (sopa) de manteiga (2 para o creme e 2 para as torradas)\n- 1/4 de dente de alho picadinho \n- 1/4 de xícara de parmesão ralado\n- Sal e pimenta a gosto ");

                    Preparo.setText("Corte os pães em rodelas e ponha numa assadeira. Misture o alho e 2 colheres de manteiga e espalhe sobre o pão. Leve ao forno para assar sem deixar escurecer. Tire do forno e espere esfriar. Cozinhe os ovos, descasque, deixe esfriar e pique bem. Pique a cebola e refogue com a manteiga restante numa frigideira. Acrescente as folhas de espinafre lavadas e secas, refogue por 2 ou 3 minutos, mexendo. Ponha o leite e deixe cozinhar por mais dois ou três minutos. Adicione o creme de leite fresco, o queijo ralado, tempere com sal e pimenta-do-reino, deixe cozinhar até reduzir bem o líquido. Desligue o fogo e espere esfriar. Bata a mistura no liquidificador ou processador. Ponha uma boa quantidade de creme de espinafre em cada torrada e leve ao forno para aquecer. Tire as torradas do forno espalhe ovo cozido ralado por cima, pimenta-do-reino e sirva quente.");

                    break;

                case "Gratinado De Espinafre":
                    Ingredientes.setText("- 2 dentes de alho\n- 1 cebola\n- 3 maços de espinafre\n- 2 colheres de sopa de farinha de trigo\n- 400ml de leite\n- Sal\n- Noz-moscada\n- 150g de muçarela ralada.");

                    Preparo.setText("Em uma panela, refogar a cebola até dourar. Adicionar o alho e refogar mais um pouco. Adicionar o espinafre picado e cozinhar até murchar. Adicionar a farinha de trigo e deixar cozinhando por alguns minutos. Adicionar o leite aos poucos e misturar sem parar. Temperar com sal e noz-moscada. Quando estiver um creme mais espesso, retirar do fogo e passar para um refratário. Cobrir com o queijo e levar ao forno preaquecido a 180 graus até dourar.");

                    break;

                case "Espinafre Cremoso":
                    Ingredientes.setText("- 1 maço de espinafre\n- 2 colheres de sopa de margarina\n- 2 colheres de sopa de farinha de trigo\n- 1/2 xícara chá de leite\n- Sal a gosto\n- Pimenta do reino a gosto\n- 1/2 lata de creme de leite\n- Queijo parmesão a gosto. \n Limpe, lave o espinafre e coloque-o em uma panela tampada. Leve ao fogo até murchar. Espere esfriar, esprema com as mãos para soltar a aguá e pique. Reserve. Na mesma panela, derreta a margarina, junte a farinhas de trigo e mexa até dourar. Retire do fogo e adicione o leite, aos poucos, mexendo para não enpelotar volte ao fogo. Tempere com sal e pimenta do reino. Junte o espinafre reservado e o creme de leite, mexa bem retire do fogo antes que ferva. Coloque em uma travessa e polvilhe com queijo. Sirva a seguir.");

                    Preparo.setText("Limpe, lave o espinafre e coloque-o em uma panela tampada. Leve ao fogo até murchar. Espere esfriar, esprema com as mãos para soltar a aguá e pique. Reserve. Na mesma panela, derreta a margarina, junte a farinhas de trigo e mexa até dourar. Retire do fogo e adicione o leite, aos poucos, mexendo para não enpelotar volte ao fogo. Tempere com sal e pimenta do reino. Junte o espinafre reservado e o creme de leite, mexa bem retire do fogo antes que ferva. Coloque em uma travessa e polvilhe com queijo. Sirva a seguir.");

                    break;

                case "Almondegas De Mandioca":
                    Ingredientes.setText("- Massa :\n- 500g de macarrão se preferir.\n- Almôndega:\n- 3 xícaras (chá) de carne moída\n- 2 xícaras (chá) de mandioca cozida e espremida\n- 1 pacote de sopa de cebola\n- 2 colheres (sopa) de manteiga\n- ½ xícara (chá) de salsa picada\n- Sal a gosto\n- Empanar (opcional):\n- Óleo para fritar ou grelhar\n- Fubá ou farinha de rosca\n- Molho de tomate:\n- 3 colheres (sopa) de azeite\n- 2 dentes de alho picado\n- 1 xícara (chá) de cebola picada\n- 3 xícaras (chá) de molho de tomate\n- 1 colher (sopa) de açúcar\n- ½ xícara (chá) de cebolinha picada\n- Sal a gosto.");

                    Preparo.setText("Massa: em uma panela com água e sal, cozinhe a massa desejada até ficar “al dente”. Almôndega: em uma tigela, misture a carne, a mandioca, a sopa de cebola, a manteiga, a salsa e o sal. Faça as bolinhas e passe no fubá ou na farinha de rosca se desejar. Frite em óleo quente ou grelhe em uma frigideira. Molho de tomate: em uma panela, refogue o alho e a cebola com um pouco de azeite. Acrescente o molho de tomate e deixe ferver um pouco. Coloque um pouco de açúcar para tirar a acidez. Finalize com cebolinha e sal.");

                    break;

                case "Bolo De Mandioca":
                    Ingredientes.setText("- 1 kg Mandioca (Macaxeira, aipim)\n- 3 unidades Ovos\n- 2 colheres (sopa) Margarina ou Manteiga\n- 1 lata Leite Condensado\n- 1 garrafa Leite de Coco\n- 2 xícaras (chá) Açúcar\n- 1 pacote Coco ralado\n- 1 pacote Queijo Ralado Caldo Bom\n- 2 xícaras (chá) Leite de vaca ( de preferência integral)\n- 1 colher (chá) Sal.");

                    Preparo.setText("Primeiro, descasque a mandioca, corte em pedaços pequenos. No liquidificador, junte todos os ingredientes, inclusive a mandioca. Bata bem, até que fique tudo bem misturadinho. Separe uma forma de sua preferência e unte com margarina e farinha de trigo. Despeje a mistura do liquidificador na forma e leve ao forno . Siga o tempo indicado para assar e vai prestando atenção até que fique dourado. Bom apetite!!!");

                    break;

                case "Mandioca Com Bacon E Tomate":
                    Ingredientes.setText("- 500 gramas de mandioca sem casca\n- 1/2 xícara de chá de bacon cortado em cubos\n- 1 lata de tomates pelado picado e com o líquido\n- 1 unidade de cebola cortada em cubos\n- 2 dentes de alho\n- 3 1/2 xícaras de chá de água\n- 2 colheres de sopa de azeite\n- sal, pimenta-do-reino e cheiro verde a gosto.");

                    Preparo.setText("Corte a mandioca em cubo grande para médio. Reserve. Leve uma panela média ao fogo médio. Regue com o azeite, acrescente o bacon e deixe cozinhar por 2 minutos, mexendo de vez em quando, até começar a dourar. Junte a cebola e refogue até murchar. Adicione o alho e refogue por apenas 1 minuto. Acrescente a mandioca e o tomate pelado (com o líquido), tempere com sal e misture bem. Regue com a água, tampe a panela e deixe cozinhar por cerca de 30 minutos, mexendo de vez em quando, até a mandioca ficar macia e o molho encorpar. Acerte o sal e a pimenta, misture o cheiro verde e sirva a seguir.");

                    break;

                case "Bolinho De Mandioca":
                    Ingredientes.setText("- 300 g de mandioca cozida e amassada\n- 2 ovos\n- Cheiro verde, pimenta- do- reino e pimenta a gosto\n- 2 colheres de farinha de trigo\n- Sal a gosto\n- Se quiser um pouco de queijo ralado . \n Misture tudo. Depois de misturados os ingredientes faça bolinhas Frite em óleo quente.");

                    Preparo.setText("Misture tudo. Depois de misturados os ingredientes faça bolinhasFrite em óleo quente.");

                    break;

                case "Palitos De Mandioca Assada":
                    Ingredientes.setText("- 1,5 kg de mandioca (cerca de 1,2 kg se comprar já descascada)\n- 3 colheres (sopa) de azeite\n- sal e pimenta-do-reino moída na hora a gosto. ");


                    Preparo.setText("Preaqueça o forno a 220 ºC (temperatura alta). Corte a mandioca em fatias grandes de cerca 8 cm de comprimento, descasque e lave bem sob água corrente. Transfira os pedaços para a panela de pressão e cubra com água, sem ultrapassar o nível máximo de ⅔ da panela. Tampe e leve a panela ao fogo alto. Quando começar a apitar, abaixe o fogo e deixe cozinhar por mais 5 minutos - a mandioca deve estar cozida mas ainda firme para ser cortada em palitos. Desligue o fogo e, importante, deixe todo o vapor sair antes de abrir a panela. Transfira a mandioca cozida para um escorredor, deixe escorrer bem a água e amornar o suficiente para você conseguir manusear os pedaços. Regue uma assadeira grande com metade do azeite. Corte cada pedaço de mandioca ao meio, no sentido do comprimento, e cada metade em palitos de cerca de 2 cm de espessura. Disponha os palitos na assadeira, um ao lado do outro, e regue com o azeite restante. Tempere com sal e pimenta a gosto. Leve ao forno para assar por cerca de 40 minutos, até os pedaços ficarem dourados - na metade do tempo, vire com uma espátula para assar por igual. Retire do forno e sirva a seguir.");

                    break;


                case "Batata Doce Assada Com Manjerona":
                    Ingredientes.setText("- 1 un batata doce\n- manjerona seca a gosto\n- azeite de oliva a gosto");

                    Preparo.setText("Corte a batata doce em palitos. Disponha em uma assadeira e regue com azeite de oliva. Salpique com a manjerona seca. Asse em forno pré-aquecido a 200ºC por 40 minutos ou até que a batata esteja bem macia. Anotações: A batata deve estar macia o suficiente para que seu bebê consiga mastigá-la mesmo quando ainda não tiver dentes. Para saber se está no ponto adequado coloque um pedaço de batata na boca e pressione-o com a língua contra o céu da boca. Caso você consiga amassá-lo sem muito esforço já pode servir a seu bebê.");

                    break;

                case "Salada De Batata Doce Amarela Com Bacalhau":
                    Ingredientes.setText("- ½ xícara de azeite de oliva\n- 2 dentes de alho picados\n- 1 kg de batata doce amarela cozida e cortada em cubos\n- 500g de bacalhau desfiado dessalgado\n- 1 cebola roxa cortada em tiras\n- ½ pimentão vermelho cortado em tiras\n- ½ pimentão amarelo cortado em tiras\n- 200g de azeitona preta\n- Sal a gosto\n- Salsinha picada a gosto\n- 4 ovos cozidos cortados em canoa.");

                    Preparo.setText("Em uma panela pequena dispor o azeite de oliva e o alho e levar ao fogo baixo por 5 minutos. Reservar para esfriar. Em um recipiente, dispor a batata doce, o bacalhau, a cebola roxa, os pimentões, as azeitonas, o sal e a salsinha. Juntar o azeite e misturar bem. Dispor os ovos cortados por cima.");

                    break;

                case "Batata Doce Frita":
                    Ingredientes.setText("- 1 kg de batata doce amarela \n- Sal a gosto\n- Óleo para fritar. \n Cozinhe a batata-doce com casca com um pouco de sal. Descasque as batatas e corte em rodelas. Frite em óleo quente, o suficiente para cobri-las. Escorra em guardanapo e sirva ainda quente.");

                    Preparo.setText("Cozinhe a batata-doce com casca com um pouco de sal. Descasque as batatas e corte em rodelas. Frite em óleo quente, o suficiente para cobri-las. Escorra em guardanapo e sirva ainda quente.");

                    break;

                case "Batata Doce Assada":
                    Ingredientes.setText("- 4 batatas doce (amarelas e roxas)\n- temperos a gosto: \n- sal \n- pimenta \n- paprica doce \n- alecrim\n- azeite");

                    Preparo.setText("Forrar uma assadeira com papel alumínio ou papel manteiga. (ajuda na limpeza)Descascar as batatas e cortar em rodelas de aproximadamente 3cm de espessura (2 dedos) e dispor na assadeira. Salpicar sobre as batatas os temperos (sal, pimenta, páprica doce, alecrim fresco). Acrescentar o azeite sobre as batatas e mexer bem para envolver os temperos. Cobrir com papel alumínio e levar para assar em forno pré-aquecido 200ºC por 30 minutos, ou até que as batatas estejam macias. Retirar o alumínio e deixar dourar por mais uns 10 minutos, para ficar douradinha por fora e macia por dentro.");

                    break;

                case "Pure De Batata Doce Amarela":
                    Ingredientes.setText("- 3 batatas-doces Amarelas\n- 1 xícara (chá) da água do cozimento\n- 2 colheres (sopa) de manteiga gelada\n- sal a gosto.");

                    Preparo.setText("Lave, seque e descasque as batatas-doces. Corte em meias-luas grossas e transfira para uma panela média. Cubra com água e tempere com ½ colher (chá) de sal. Leve ao fogo alto e, assim que ferver, deixe cozinhar por cerca de 20 minutos, ou até ficarem macias - para verificar, espete com um garfo. Desligue o fogo e reserve 1 xícara (chá) da água do cozimento. Escorra as batatas por uma peneira. Volte as batatas, ainda quentes, para a mesma panela e bata com um mixer até ficar bem liso. Acrescente, aos poucos, a água do cozimento para dar o ponto. Se preferir um purê mais rústico, passe as batatas por um espremedor. Junte a manteiga e mexa bem com uma espátula até derreter e o purê ficar cremoso. Prove e, se necessário, tempere com mais sal. Sirva a seguir.");

                    break;


                case "Geleia De Uva":
                    Ingredientes.setText("- 1 kg de uva\n- açúcar a gosto\n- 1 unidade de maçã sem sementes, picada");

                    Preparo.setText("Retirar as uvas do cacho e lavarEm uma panela, colocar pra ferver com a água as uvas, a água tem que cobri-las. Quando estiver um caldo escuro, desligar e deixar esfriar. Passar no liquidificador juntamente com a maçã em pedaços e depois coar. Voltar a ferver em fogo baixo, mexer de vez em quando até engrossar.");

                    break;

                case "Crème Brulée":
                    Ingredientes.setText("- 2 xícaras de suco de uva integral\n- 1/2 xícara de castanha de caju crua deixada de molho por 6 horas\n- 1 e 1/2 xícaras de leite de coco\n- 1/4 xícara de goma de tapioca\n- 1/4 xícara de açúcar demerara\n- 1/2 colher (chá) de ágar-ágar\n- 1 fatia fina de beterraba cozida (opcional)\n- 1/4 de xícara de açúcar demerara");

                    Preparo.setText("Escorra as castanhas e bata com todos os ingredientes no liquidificador até obter um creme homogêneo. Passe para uma panela e mexa até ferver e engrossar. Distribua em ramekins e leve à geladeira por 2 horas, no mínimo. Bata o açúcar para o brulée no processador ou liquidificador para que ele fique com uma textura mais fina. Polvilhe um pouco de açúcar sobre cada um dos cremes gelados. Caramelize o açúcar com ajuda de um maçarico. Sirva com uvas frescas.");

                    break;

                case "Uvas No Mar Negro":
                    Ingredientes.setText("- 790g de leite condensado\n- 3 colheres de sopa de cacau em pó\n- 50g de manteiga\n- 200g de creme de leite\n- ½ kg de uva sem semente cortadas ao meio\n- 3 claras\n- 1 xícara de açúcar\n- 175g de creme de leite fresco");

                    Preparo.setText("Em uma panela misturar o leite condensado, o cacau em pó e a manteiga, levar ao fogo médio até a mistura começar a soltar do fundo da panela. Misturar o creme de leite e mexer por mais 2 minutos. Desligar o fogo e reservar. Com a ajuda da batedeira, bater as claras em neves até obter picos firmes, então juntar o açúcar aos poucos até o merengue estar liso. Adicionar o creme de leite e reservar. Dispor as uvas em um refratário, cobrir com o creme de chocolate e finalizar com a camada de merengue. Refrigerar por 1 hora.");

                    break;

                case "Surpresa De Uva":
                    Ingredientes.setText("- 1 LATA DE LEITE CONDENSADO\n- 400 gramas de UVAS SEM SEMENTES\n- 300 gramas de AÇÚCAR DE CONFEITEIRO ou GLAÇÚCAR");

                    Preparo.setText("Remova as uvas do cacho. DICA: Segure a base do talo que prende a uva ao cacho com uma mão, com a outra mão segure e gire a uva como se fosse desparafusá-la do cacho. Dessa forma, você corre menos risco de abrir fissuras na fruta. Reserve as uvas higienizadas e secas. Na hora de usá-las, evite as que tiverem fissuras e as que estiverem escorrendo. Coloque o leite condensado numa panela em fogo baixo e mexa até que chegue ao ponto de desgrudar do fundo. Não é preciso adicionar mais nada. DICA 2: Se perceber que o fundo da panela está caramelizando mais rápido, tire a panela do fogo mexendo para homogeneizar o preparo, até perder um pouco a temperatura, então volte com a panela ao fogo baixo (repita este processo quantas vezes achar necessário). Despeje o preparo num prato untado com manteiga sem sal e aguarde esfriar. Com uma colher, coloque pequenas porções do doce sobre o açúcar peneirado. Em vez de untar as mãos e enrolar em bolinhas, você vai empanar o docinho no açúcar e achatar com os dedos para abrir um disco. Ao perceber que a massinha está ficando pegajosa, é só passá-la no açúcar e continuar abrindo entre os dedos. Posicione a uva no meio do disco e a envolva com a massinha, sempre passando no açúcar quando começar a ficar pegajosa nos dedos. Com a massa já envolvendo a uva, molde do centro da uva para as extremidades (assim evita a formação de bolhas de ar e a massa fica toda grudadinha na fruta). Tire os excessos que vão se formar nas extremidades. Para um acabamento melhor, passe a surpresa de uva novamente no açúcar e delicadamente enrole na mão para ficar lisinha.");

                    break;

                case "Escondidinho De Uva":

                    Ingredientes.setText("- 1 lata de leite condensado\n- 1 lata de suco de uva concentrado (mesma medida da lata de leite condensando)\n- 1 lata de leite integral (mesma medida da lata de leite condensando)\n- 1 lata de creme de leite\n- 350 g de chocolate meio amargo ou ao leite picado\n- 1 colher (sopa) de amido de milho\n- 10 uvas para decorar\n- 50 ml de conhaque");

                    Preparo.setText("Higienizar as uvas. Em seguida, coloque as uvas arrumadas no fundo de um refratário de vidro no formato de sua preferência. Dissolva o amido de milho em menos da metade do leite e reserve. Em uma panela, coloque o leite condensado, as gemas e o restante do leite. Misture bem e leve ao fogo baixo. Continue mexendo até levantar fervura. Quando isso acontecer, acrescente aos poucos o amido de milho dissolvido no leite, sem parar de mexer. Cozinhe até engrossar e começar a desgrudar do fundo da panela. Desligue o fogo e despeje o creme ainda quente por cima das uvas e leve para a geladeira. Reserve por 3 horas. Assim que o creme branco já estiver frio, é hora de preparar o creme preto. Ferva o creme de leite e despeje-o sobre o chocolate picado. Mexa bem até que o chocolate tenha sido completamente derretido. Acrescente o conhaque e misture tudo até obter um creme liso e brilhante. Despeje por cima do creme branco e volte com o recipiente para a geladeira por mais 5 horas.");

                    break;

                case "Nabo Gratinado":
                    Ingredientes.setText("- 1/2 kg de nabo\n- 250 ml de leite\n- 1 e 1/2 colher de sopa de manteiga\n- 1 e 1/2 colher de sopa de farinha de trigo\n- Sal\n- Pimenta do reino\n- 1 pitada de noz-moscada\n- Queijo mussarela ralada");

                    Preparo.setText("Descascar os nabos, lavar, e cortar em rodelas bem finas. Dispor em camadas num recipiente para ir ao forno. Derreta a manteiga, juntar a farinha e mexa até dourar. Juntar o leite morno, temperar com sal, pimenta e noz moscada e mexer até engrossar. Retirar do fogo. Coloque sobre os nabos. Polvilhe o queijo ralado. Levar ao forno a 200ºC até dourar.");

                    break;

                case "Nabo Crocante":
                    Ingredientes.setText("- 1 kg de nabo\n- 250 ml de óleo para fritar\n- Sal");

                    Preparo.setText("Corte o nabo em rodelas finas e frite em óleo quente. Após frito coloque 1 pitada de sal. Coloque no papel toalha e sirva quentinho.");

                    break;

                case "Salada De Nabo":
                    Ingredientes.setText("- Suco de um limão (+/-50ml)\n- 200gr de Cenouras\n- 350gr de Nabos\n- 1 colher de sopa rasa de sal marinho\n- coentro a gosto");

                    Preparo.setText("Adicionar o sumo de limão e o sal ao nabo e cenoura ralada. Com a ajuda das mãos, amassar / pressionar a salada com carinho. Assim que o nabo deixar de ficar rijo, e começar a ficar maleável, parar e deixar repousar por 30 minutos (ou mais se desejar). Antes de servir, escorrer bem toda a água. Provar e acertar o tempero. Se estiver insosso colocar mais sal a gosto, se estiver muito salgado passar por um pouco de água e voltar a escorrer bem. Picar os coentros e colocar por cima, está prontinha a servir!");

                    break;

                case "Creme De Nabo":
                    Ingredientes.setText("- 50 g de batatas\n- 2 Cebolas\n- 2 dentes de Alho\n- 500 g de nabo\n- 150 g de alho-francês\n- 200 g de couve-flor\n- 1,2 l de água fria\n- 2 c. (de sopa) de Manteiga\n- 1 c. (de sopa) de mel\n- 1/2 limão\n- 1 dl de natas\n- 1 c. (de sopa) de coentros picados\n- sal q.b.");

                    Preparo.setText("Descasque as batatas, as cebolas, os alhos e os nabos. Corte-os em pedaços, juntamente com o alho-francês e a couve-flor, reservando um nabo inteiro. Coloque tudo num tacho, verta a água e tempere com sal. Entretanto, corte o nabo reservado em cubinhos e salteie-os na manteiga. Junte o mel, o sumo de limão e sal. Deixe caramelizar um pouco e reserve. Assim que os legumes se encontrarem todos cozidos, retire do lume e triture bem a sopa. Leve-a novamente a lume brando com as natas e deixe ferver. Por fim, retifique os temperos e sirva a sopa com o nabo caramelizado e os coentros picado.");

                    break;


                case "Smoothie Caroteno":
                    Ingredientes.setText("- meio mamão picado\n- polpa de meio maracujá\n- meia cenoura sem casca\n- 1 xícara (chá) de leite gelado\n- meia colher (sopa) de linhaça\n- 1 colher (sopa) de mel");

                    Preparo.setText("Em um liquidificador bata bem todos os ingredientes. Sirva gelado.");

                    break;

                case "Sorvete De Mamão":
                    Ingredientes.setText("- 2 mamões sem casca e sem sementes\n- 1 xícara (chá) de água quente\n- 1/2 xícara (chá) de adoçante\n- 1/2 xícara (chá) de iogurte natural desnatado\n- 1/2 colher (chá) de essência de baunilha");

                    Preparo.setText("Corte o mamão em pedaços e coloque no liquidificador. Bata até obter um creme. Reserve 2 xícaras. Em uma panela, misture a água quente e o adoçante. Leve ao fogo até dissolver completamente. Acrescente o adoçante dissolvido ao mamão e misture bem. Leve para congelar por 4 a 6 horas. Mexa de hora em hora para desmanchar os cristais de gelo. Transfira a mistura para o liquidificador. Adicione o iogurte e a baunilha. Bata até obter um creme liso. Congele.");

                    break;

                case "Chutney De Mamão":
                    Ingredientes.setText("- 2xic de papaia\n- 2 c. sopa de cebola picada fino\n- 1 xic de maçã picada fino\n- 1/4 xic de passas\n- 1/2 xic de vinagre de vinho branco\n- 1/2 xíc de açúcar mascavo\n- 1 c. sopa de suco de limão\n- 1/4 xic. de água\n- 1 c. sopa pimentão picadinho\n- 1/2 c. sopa de gengibre ralado\n- 1 dente de alho amassado\n- 1/2 c. cha de sal");

                    Preparo.setText("Faço todo o pré preparo com os ingredientes já picados meço as porções e coloco todos em uma panela tampada por 30-40 minutos, mexendo de vez em quando. O ponto é de uma geleia, sem que comece a pegar no fundo.");

                    break;

                case "Ceviche De Mamão":
                    Ingredientes.setText("- 500g de mamão de vez (alaranjado, mas ainda bem firme) \n- 4 colheres (sopa) de coentro picado \n- 1 xícara de suco de limão \n- Sal a gosto \n- 1/4 de pimentão vermelho picado\n- 2 pimentas dedo-de-moça, uma verde e uma vermelha, picadas (com ou sem sementes, se quiser mais ou menos picante) \n- 1 cebola roxa fatiada");

                    Preparo.setText("Descasque o mamão, tire as sementes e corte-o em pedaços pequenos. Misture-o aos outros ingredientes, espere meia hora e sirva com chips de mandioca (lascas de mandioca feitas com descascador de legumes e fritas).");

                    break;

                case "Doce De Mamão":
                    Ingredientes.setText("- 1 mamão grande e maduro (350 g)\n- 200 gramas de coco\n- 3 1/2 xícara (chá) de açúcar (500 g aproximadamente)\n- 3 cravo-da-índia (ou cravinho)\n- 1 pedaço de canela em pau");

                    Preparo.setText("Descasque e retire as sementes do mamão. Bata no liquidificador. Em uma panela, coloque o mamão, o coco, o açúcar, o cravo e a canela. Leve ao fogo baixo (160 ºC), mexendo sempre até chegar ao ponto de pegar o doce com a colher.");

                    break;


                case "Bolo De Kiwi":
                    Ingredientes.setText("- 1 xícara (chá) de Água\n- 1/2 xícara (chá) de linhaça dourada\n- 2 xícaras (chá) de açúcar demerara\n- 3 unidades de kiwi sem casca fatiados\n- 1/2 xícara (chá) de óleo de canola\n- 1/2 xícara (chá) de leite semidesnatado\n- 2 unidades de ovo\n- 1 1/2 xícara (chá) de farinha de trigo\n- 1/2 xícara (chá) de farinha de aveia\n- 1 colher (sopa) de fermento químico em pó");

                    Preparo.setText("No liquidificador, bata a água com a linhaça e deixe descansar por 1 hora. Unte uma forma com 25 cm de diâmetro, polvilhe 1/2 xícara (chá) de açúcar no fundo e cubra com o kiwi. Reserve. Bata no liquidificador o óleo com o leite, os ovos e o açúcar restante. Junte a linhaça e bata até a mistura ficar homogênea. Passe para uma tigela e adicione as farinhas e o fermento, misturando com uma colher. Transfira para a forma e leve ao forno, preaquecido, em temperatura média (170 °C a 190 °C) por 40 minutos, ou até dourar. Retire do forno, passe uma faca em volta da massa e desenforme. Sirva frio.");

                    break;

                case "Tortinha De Kiwi":
                    Ingredientes.setText("- Massa:\n- 2 xícaras (chá) de farinha de trigo\n- 1 xícara (chá) de manteiga (cerca de 200g)\n- 2 gemas\n- meia xícara (chá) de açúcar de confeiteiro (cerca de 100g)\n- 170 g de chocolate meio amargo\n- Recheio:\n- 2 xícaras (chá) de leite em pó\n- meia xícara (chá) de açúcar\n- 2 gemas\n- 2 colheres (sopa) de amido de milho\n- 6 kiwis em cubos pequenos");

                    Preparo.setText("Massa: Em uma tigela, misture a farinha de trigo com a manteiga, as gemas e o açúcar de confeiteiro, até obter uma massa homogênea. Cubra com filme plástico e leve à geladeira por cerca de 30 minutos. Faça dez bolinhas e forre o fundo e as laterais de formas individuais (7 cm de diâmetro). Leve ao forno médio-alto (200°C), preaquecido, por cerca de 30 minutos. Com a massa ainda quente, coloque pedaços do chocolate, espalhe sobre a massa para derreter e deixe esfriar. Desenforme e reserve. Recheio: Em uma panela, misture o leite em pó com o açúcar, as gemas e o amido de milho. Misture bem e cozinhe, em fogo médio, por cerca de 5 minutos. Despeje o creme sobre a massa reservada e distribua o kiwi. Leve à geladeira por cerca de 2 horas. Sirva.");

                    break;

                case "Picolé De Kiwi Fit":
                    Ingredientes.setText("- 3 Xícaras (chá) Kiwi picado\n- 1 Colher (sopa) Açúcar demerara ou adoçante\n- 400 ml Água de coco");

                    Preparo.setText("Misture o açúcar ou o adoçante a água de coco. Coloque os kiwis picadinhos em forminhas de picolé (um pouquinho em cada) e complete com a água de coco. Leve ao congelador por pelo menos 2 horas. Caso não queira seu picolé fit com pedaços da fruta, bata todos os ingredientes no liquidificador e coloque nas forminhas.");

                    break;

                case "Delícia De Kiwi":
                    Ingredientes.setText("- 1 litro de leite integral\n- 1 caixa de leite condensado\n- 1 gema de ovo\n- 2 colheres de amido de milho\n- 1 barra de chocolate meio amargo ou ao leite\n- 1 caixa de creme de leite\n- 3 kiwis descascados e cortados em rodelas");

                    Preparo.setText("Em uma panela coloque o leite, o leite condensado, a gema e o amido (previamente diluído em um pouco de leite). Misture bem e leve a fogo brando mexendo sempre. Mexa até chegar em ponto de mingau (o volume da mistura aumentará bastante) e reserve até esfriar. Em taças individuais coloque algumas rodelas de kiwi no fundo. Coloque o creme sobre o kiwi até cobrir completamente e chegar até mais da metade da taça. Coloque mais rodelas de kiwi sobre o creme e reserve. Quebre o chocolate em pedaços e leve em um recipiente adequado ao micro-ondas, coloque uns 30 segundos, retire e mexa, coloque mais 30 segundos e retire. Mexa até o chocolate derreter-se por completo. Acrescente aos poucos o creme de leite ao chocolate derretido, mexendo até formar um ganache. Despeje o ganache sobre os kiwis. Leve a geladeira até servir.");

                    break;

                case "Vinagrete De Kiwi":
                    Ingredientes.setText("- 6 unidades Kiwi\n- 2 colheres sopa Azeite de oliva extravirgem\n- 1 colher sopa Vinagre de vinho branco\n- 4 unidades Pimenta do reino em grão\n- À gosto Sal");

                    Preparo.setText("Descasque os kiwis e coloque no liquidificador. Adicione os demais ingredientes e processe até ficar cremoso. Caso queira mais espesso, adicione mais kiwi. Sirva acompanhando com salada de folhas normal.");

                    break;


                case "Sopa De Inhame":
                    Ingredientes.setText("- 4 inhames de tamanho médio\n- 1 colher (de sopa) de tempero de alho e cebola\n- 2 colheres (de sopa) de óleo\n- 1 colher (de sopa) de sal\n- 2 colheres (de sopa) de cheiro verde\n- 50 g de bacon\n- Meio litro de água");

                    Preparo.setText("Descascar o inhame, lavá-lo bem e cortá-lo em pedaços. Pôr o óleo numa panela e refogar o inhame com o tempero, cheiro verde e bacon. Adicionar a água e tampar. Cozinhar durante 20 minutos. O resultado final é um caldo grosso, com pedaços menores do inhame. Na hora de servir, coloque mais um pouco de cheiro verde sobre a sopa.");

                    break;

                case "Dadinho De Inhame":
                    Ingredientes.setText("- 250 g de inhame \n- Pimenta-do-reino a gosto \n- Sal marinho a gosto \n- 100 ml de azeite \n- ½ pimenta dedo-de-moça \n- 1 talo de tomilho pequeno \n- 1 talo de alecrim pequeno");

                    Preparo.setText("250 g de inhame Pimenta-do-reino a gosto Sal marinho a gosto 100 ml de azeite ½ pimenta dedo-de-moça 1 talo de tomilho pequeno 1 talo de alecrim pequeno");

                    break;

                case "Inhame Ao Murro":
                    Ingredientes.setText("- 4 inhames (cerca de 500 g)\n- 2 colheres (sopa) de azeite\n- tomilho a gosto\n- sal e pimenta-do-reino moída na hora a gosto");

                    Preparo.setText("Pré aqueça o forno a 200 ºC (temperatura média). Regue uma assadeira pequena com 1 colher (sopa) de azeite. Com uma escovinha para legumes, lave bem os inhames sob água corrente, esfregando bem para tirar os pelinhos da casca. Transfira para uma panela média, cubra com água e leve para cozinhar em fogo alto. Quando começar a ferver, diminua o fogo e deixar cozinhar por mais 30 minutos, até ficarem macios. Assim que estiverem cozidos, escorra a água. Sobre a tábua, abra um pano de prato limpo e coloque um inhame, ainda quente, no centro - cuidado para não se queimar. Dobre o pano sobre o inhame e dê um murro certeiro para achatar levemente o inhame, sem rachar completamente. Transfira para a assadeira e repita com os demais. Debulhe as folhas de tomilho sobre os inhames, regue com o azeite restante e tempere com sal a gosto - o sal moído na hora, além de temperar, dá uma textura crocante. Leve ao forno para assar por cerca de 30 minutos, ou até ficarem dourados. Retire do forno e sirva a seguir. Fica ótimo servido com ragu de carne.");

                    break;

                case "Bolinho De Inhame":
                    Ingredientes.setText("- 500 g de inhame, cozido e espremido\n- 1 ovo\n- 3 colheres (sopa) de margarina sem sal\n- 2 e meia colheres (sopa) de queijo tipo parmesão ralado\n- 1 xícara (chá) de farinha de trigo\n- 1 sachê de caldo de legumes");

                    Preparo.setText("Em uma tigela grande, coloque o inhame, o ovo, a margarina, o queijo ralado e a farinha de trigo. Polvilhe com caldo de legumes e misture bem como auxílio de uma colher, até obter uma massa homogênea. Molde esferas de 3 cm de diâmetro entre a palma das mãos enfarinhadas. Frite-as em imersão, em óleo quente, por 5 minutos ou até dourarem. Escorra em papel toalha e sirva em seguida");

                    break;

                case "Pure De Inhame":
                    Ingredientes.setText("- 4 inhames\n- 1 xícara (chá) de leite\n- 2 dentes de alho descascados\n- 2 colheres (sopa) de manteiga\n- noz-moscada ralada na hora a gosto\n- sal e pimenta-do-reino moída na hora a gosto");

                    Preparo.setText("Lave, descasque, seque e corte os inhames em pedaços médios. Transfira para uma panela média, cubra com água e junte 1 colher (chá) de sal e os alhos já descascados.  Leve para cozinhar em fogo alto. Assim que começar a ferver, abaixe o fogo para médio e cozinhe por 25 minutos, ou até que os pedaços fiquem macios - espete com um garfo para verificar.  Desligue o fogo e escorra a água numa peneira. Enquanto isso, numa panelinha, leve o leite ao fogo baixo para aquecer, sem deixar ferver - para o purê não empelotar, o leite deve estar na mesma temperatura do inhame. Passe os inhames com os dentes de alho ainda quentes pelo espremedor e volte para a mesma panela. Leve ao fogo médio e acrescente o leite, aos poucos, mexendo com um batedor de arame para incorporar. Desligue o fogo, misture a manteiga e tempere com sal, pimenta-do-reino moída na hora a gosto e uma pitada de noz-moscada e sirva.");



                case "Suflê De Chuchu":
                    Ingredientes.setText("- 3 unidade(s) chuchus cortados em pedaços pequenos\n- 1 unidade(s) celoba grande (bem picadinha)\n- 1 colher(es) de sopa manteiga extra sem sal\n- 2 unidade(s) ovos grandes (separe as claras)\n- 1 colher(es) de sopa queijo ralado\n- 4 colher(es) de sopa farinha de trigo (sem fermento)\n- 1 copo(s) leite integral (250ml)\n- 1 colher(es) de sopa fermento químico em pó\n- 5 dente(s) alho (bem picadinhos)\n- a gosto sal e pimenta do reino (branca ou preta)");

                    Preparo.setText("Cozinhe os chuchus até ficarem macios (porém firme)Escorra-os e reserve-osEm uma panela, prepare um refogado: doure a cebola, o alho na manteiga. Acrescente as gemas dos ovos, o queijo ralado, a farinha de trigo, o leite, o fermento, o sal e a pimenta do reino. Reserve o refogado. A parte, bata as claras até que fiquem 'claras em neve'. Unte e enfarinhe uma forma retangular (média) de vidro e/ ou alumíniu. Ligue o forno (para pré-aquecer) em 180ºCMisture delicadamente no refogado os chuchus previamente cozidos e escorridos e as 'claras em nove'. Coloque a mistura na forma (já untada e enfarinhada) e leve ao forno na mesma temperatura (180ºC) até dourar . Sirva a seguir.");

                    break;

                case "Purê Delicioso De Chuchu":
                    Ingredientes.setText("- 3 chuchus médios\n- 2 colheres (sopa) de manteiga\n- 3 colheres (sopa) de farinha detrigo\n- 2 colheres (sopa) de queijo tipo parmesão ralado ? e mais um pouco para salpicar sobre o purê\n- Sal a gosto");

                    Preparo.setText("Coloque uma panela com uma pouco de água para ferver (quantidade que cubra os chuchus). Enquanto isso descasque os chuchus, retire-lhes os centros e corte-os em pedaços médios. Coloque-os na água que já deve estar a ferver e junte 1 colher (chá) cheia de açúcar. Cozinhe até que fiquem macios, então os escorra dentro de uma peneira grande ou de um escorredor de massas. Jogue imediatamente sobre os chuchus uma boa quantidade de água gelada para que eles voltem a ter uma bonita cor. Coloque os pedaços do legume dentro do copo do liquidificador e bata no início usando a tecla pulsar até obter um creme liso e homogêneo - não coloque líquido nenhum. Reserve. Derreta a manteiga numa panela e junte a farinha de trigo. Cozinhe por alguns minutos sempre mexendo e depois vá adicionado o creme de chuchu. Vá o adicionado aos poucos e mexendo vigorosamente com um batedor de arame (fouet) ou com uma colher de pau até que fique um creme bem liso e sem grumos. Cozinhe por mais alguns minutos sempre mexendo, junte o parmesão e coloque sal a gosto (não coloque muito). Passe para uma travessa de serviço e salpique mais um pouco de parmesão, se quiser decore com fatias de chuchu cozidas com um pouco de sal.");

                    break;

                case "Chuchu Gratinado":
                    Ingredientes.setText("- 2 colheres (sopa) de manteiga\n- 2 colheres (sopa) de farinha de trigo\n- 2 xícaras de leite fervido\n- sal a gosto\n- pimenta-do-reino branca a gosto\n- noz-moscada a gosto\n- 1 kg de chuchu descascado\n- 1 fio de azeite\n- 100 g de parmesão ralado");

                    Preparo.setText("Em uma panela, adicione a manteiga, a farinha e o leite fervido, mexa até engrossar. Tempere com sal, pimenta-do-reino branca e noz-moscada, reserve. Corte os chuchus em fatias finas e tempere com sal. Deixe descansar por 5 minutos. Em seguida, lave e deixe secar. Em outra panela, adicione 1 fio de óleo e as fatias de chuchu. Tempere com sal e pimenta-do-reino. Unte uma travessa com azeite e cloque as fatias de chuchu. Cubra-as com o molho reservado. Adicione queijo parmesão ralado por cima. Leve ao forno para gratinar (180° C), por cerca de 30 minutos. Sirva quente");

                    break;


                case "Chuchu Assado":
                    Ingredientes.setText("- 2 unidades de chuchu\n- a gosto de azeite de oliva\n- a gosto de pimenta do reino\n- a gosto de orégano fresco\n- a gosto de sal");

                    Preparo.setText("Descasque os chuchus e corte-os ao meio. Corte cada metade em mais 4 ou 6 fatias de aproximadamente 1 cm. Unte uma assadeira com azeite de oliva e arrume os chuchus enfileirados. Tempere com sal e pimenta-do-reino por cima e regue com um fio de azeite de oliva. Coloque folhas de orégano fresco e leve ao forno pré-aquecido a 180°, por 30 minutos.");

                    break;

                case "Chuchu Ao Alho E Óleo":
                    Ingredientes.setText("- 200 gr de chuchu descascado sem semente e cortado em cubos (se você estiver usando o grande) ou 200 gr de mini chuchu branco cortado em 4 sem a semente.\n- 2 dentes de alho picados bem pequenininho.\n- azeite e sal à gosto.");

                    Preparo.setText("Em uma panela com água fervente e sal cozinhe os cubinhos de chuchu até que ao furar com um garfo não tenha resistência, mas continuem firmes. Em uma frigideira coloque o azeite em abundância e o alho, leve ao fogo médio e deixe o alho dourar. Escorra o chuchu e coloque no azeite e no alho, mexendo para que todo pedacinho ganhe sua dose de sabor. Tempere com sal e pimenta e sirva!");

                    break;

                case "Chuchu Recheado":
                    Ingredientes.setText("- 2 chuchu\n- 1 xícara (chá) de carne bovina moída\n- 1 colher (sopa) de azeite de oliva\n- 1 colher (sopa) de cebola picada\n- 1 dente de alho amassado\n- 1/2 xícara (chá) de molho de tomate\n- sal a gosto\n- cheiro-verde picado a gosto\n- queijo parmesão ralado");

                    Preparo.setText("Descasque e corte o chuchu na horizontal. Retire o miolo e cozinhe por 5 minutos em água fervente e sal. Escorra e reserve. Aqueça o azeite e refogue a cebola e o alho. Junte a carne moída e deixe dourar. Ponha o molho de tomate, tempere com o sal e o cheiro-verde e ferva por 5 minutos. Distribua a carne na cavidade dos chuchus e polvilhe com o queijo ralado. Disponha os chuchus em um refratário untado e leve ao forno para gratinar.");

                    break;

                case "Chuchu Mexicano":
                    Ingredientes.setText("- 5 xícaras de água\n- 1/2 colher de chá de sal\n- 450 g de chuchu, sem sementes e cortado longitudinalmente, em 8 fatias\n- Para o Molho de Iogurte:\n- 1 pimentão verde, picado para produzir 1 xícara\n- 1/2 abacate, sem caroço\n- 1/4 colher de chá de cominho em pó\n- 3/4 de xícara de iogurte natural desnatado\n- 1/4 de xícara de maionese com baixo teor de gordura\n- Sal e pimenta-do-reino, moída na hora.");

                    Preparo.setText("Em uma panela média, coloque a água e sal e ferva, em fogo médio-alto. Adicione o chuchu e cozinhe até ficar macio, cerca de 10 minutos. Coe e reserve. Para o Molho de Iogurte: Em um processador de alimentos, misture o pimentão, o abacate, o cominho em pó, o iogurte, a maionese até ficar homogêneo, cerca de 1 minuto. Tempere com sal e pimenta a gosto. Transfira para uma tigela e deixe descansar por 10 minutos para engrossar. Sirva o molho com chuchu quente ou à temperatura ambiente.");

                    break;




                case "Bolo De Beterraba":
                    Ingredientes.setText("- 240 gramas de BETERRABA depois de limpas e lavadas\n- 200 ml de ÓLEO DE GIRASSOL\n- 3 OVOS\n- 280 gramas de AÇÚCAR\n- 240 gramas de FARINHA DE TRIGO ou 2 xícaras de chá\n- 8 gramas de FERMENTO EM PÓ ou 2 colheres de chá\n- 1/2 colher de café de SAL");

                    Preparo.setText("Unte e enfarinhe uma forma de bolo com 19 cm de diâmetro. Bata as beterrabas picadas, o óleo, os ovos e o açúcar no liquidificador. Coloque em uma tigela e acrescente a farinha, sal e o fermento peneirados. Misture. Leve para assar a 180°C por aproximadamente 1 hora, ou até que o seu palito saia limpo de dentro do bolo.");

                    break;

                case "Beterraba Em Conserva":
                    Ingredientes.setText("- 2 Xícaras de beterrabas\n- ½ Xícara de água\n- ½ Xícara de vinagre branco\n- ½ Xícara de açúcar\n- 1 Colher de chá de sal\n- ½ Colher de chá de pimenta do reino");

                    Preparo.setText("Corte os talos e lave bem as beterrabas e descasque. Cozinhe até ficarem bem macias com água o suficiente para cobrir-las. Esfrie bem e fatie em pequenos pedaços e coloque em um pote de vidro limpo e com tampa. Em uma panela adicione o vinagre, açúcar, água, sal e pimenta, mexa em fogo médio até diluir todo o açúcar e quando começar a ferver desligue, e coloque ainda quente sobre as beterrabas, mexa com cuidado para envolver toda tudo, espere esfriar e leve para a geladeira. Mantenha sempre o pote bem fechado e na geladeira ela vai durar até 8 semanas, isso se você não comer antes.");

                    break;

                case "Espagueti Ao Molho De Beterraba":
                    Ingredientes.setText("- 500 gramas de macarrão espaguete\n- 1 unidade de cebola média picada\n- 2 dentes de alho picados\n- 1/2 unidade de pimentão vermelho sem sementes e picado\n- 2 unidades de cenoura médias cortadas em pedaços grandes (sem casca)\n- 1 unidade de beterraba média (sem casca)\n- 2 colheres (sopa) de azeite de oliva\n- 2 colheres (sopa) de vinagre de vinho tinto\n- 1 litro de água\n- 1/2 xícara (chá) de manjericão fresco\n- 1 colher (sopa) de orégano\n- 1 colher (sopa) de molho inglês\n- sal a gosto");

                    Preparo.setText("Cozinhe o espaguete conforme indicado na embalagem, até ficar “al dente”. Reserve. Em uma panela de pressão, frite a cebola no azeite, junte o pimentão, o alho e mexa bem. Acrescente a cenoura, a beterraba e o manjericão, um litro de água e cozinhe sob pressão por 10 minutos. Após o cozimento, deixe em tempo de espera, descansando por alguns minutos. Abra cuidadosamente a panela, retirando a pressão. Bata tudo em um liquidificador, ou usando um mixer, até o molho ficar bem cremoso e homogêneo. Volte para a panela em fogo baixo, acrescente mais água se necessário, o vinagre, o molho inglês e o orégano. Acerte o sal. Cozinhe até ficar com uma consistência cremosa. Sirva sobre o espaguete.");

                    break;

                case "Pasta De Beterraba":
                    Ingredientes.setText("- 1 beterraba média\n- 150g de ricota fresca\n- 2 colheres (sopa) de leite\n- 1 colher (café) de suco de limão\n- 1 dente de alho amassado\n- Sal a gosto\n- Azeite a gosto");

                    Preparo.setText("1. Pique a beterraba e cozinhe a vapor para não perder líquido. Deixe esfriar. 2. Junte todos os ingredientes e bata no liquidificador ou mixer.");

                    break;

                case "Hummus De Beterraba":
                    Ingredientes.setText("- 2 beterrabas pequenas (cozidas)\n- 1 xícara (de chá) de grão de bico (cozido)\n- 2 dentes de alho\n- 1 limão (suco)\n- 1/4 xícara (de chá) de azeite de oliva\n- sal e pimenta do reino");

                    Preparo.setText("Deixe 1/2 xícara de grão de bico seco de molho por 24 horas (ou use o cozido enlatado), passado este tempo, escorra e lave os grãos leve para a panela de pressão os grãos de bico para cozinhar, junto com as pequenas beterrabas (se usar o grão de bico de lata coloque para cozinhar apenas a beterraba) por 40 minutos ou até que os grãos de bico e as beterraba estejam maciosNo processador ou mixer coloque o grãqo de bico, a beterraba descascada, o alho, o suco de limão, o azeite e bata até obter um creme cor de rosa, tempere com sal e pimenta e sirva.");

                    break;




                case "Bolo De Banana E Canela":
                    Ingredientes.setText("- 3 ovos\n- 3/4 xícaras (de chá) de óleo\n- 3 bananas grandes (ou 4 pequenas) amassadas\n- 2 xícaras (de chá) de açúcar\n- 2 e 1/2 xícaras (de chá) de farinha de trigo peneirada\n- 1 colher (de sopa) de canela\n- 1 colher (de sopa) de fermento em pó");

                    Preparo.setText("Bata no liquidificador: os ovos, o óleo, as bananas amassadas, o açúcar e a canela. Passe a mistura para um recipiente e junte a farinha e bata com a batedeira ou com uma colher. Depois adicione o fermento e misture com a espátula. Unte uma forma com margarina e polvilhe açúcar, transfira a massa. Leve ao forno pré-aquecido a 200 ºC por aproximadamente 40 minutos.");

                    break;

                case "Bolinho De Chuva Com Banana":
                    Ingredientes.setText("- Massa\n- 1 ovo batido\n- 1 banana amassada\n- 3 colheres de sopa de açúcar\n- 1½ copo de leite\n- 1½ xícara de farinha de trigo\n- 1 colher de chá de fermento em pó\n- Açúcar e canela a gosto");

                    Preparo.setText("Bata o ovo como se fosse fazer uma omelete. Adicione a banana amassada, o açúcar, o leite e a farinha de trigo. Vai formar uma massa pesada, que dê para pegar de colherada (parecida com a de panqueca). Coloque o fermento e misture bem. Com uma colher, despeje pequenas quantidades da massa em uma panela com óleo quente, o suficiente para a massa conseguir “virar”. Outro detalhe importante é que não pode colocar muita massa, senão não cozinha por completo no interior. No fim, é só rolar os bolinhos na mistura de açúcar e canela.");

                    break;


                case "Creme De Banana Com Chocolate":
                    Ingredientes.setText("- 4 bananas-maçã maduras e amassadas\n- 1 colher (sobremesa) de manteiga\n- 1 lata de leite condensado\n- 1/2 xícara (chá) de leite\n- 3 colheres (sopa) de chocolate em pó");

                    Preparo.setText("Em uma panela, misture a banana e a manteiga. Cozinhe, mexendo sem parar, durante 5 minutos. Deixe esfriar e bata no liquidificador. Em uma panela, misture o creme de banana, o leite condensado, o leite e o chocolate em pó. Leve ao fogo brando, mexendo sem parar, até começar a desgrudar do fundo da panela e engrossar ligeiramente. Distribua em taças individuais ou coloque em um refratário. Leve para gelar. Na hora de servir, decore com rodelas de banana.");

                    break;

                case "Cookie De Banana E Aveia":
                    Ingredientes.setText("- 2 bananas nanicas maduras quanto mais maduras mais doces fica\n- 1 xícara (de chá) de aveia em flocos");

                    Preparo.setText("Amasse a banana com um garfo e misture com a aveia, aqueça o forno em temperatura alta,Coloque colheradas da massa em uma assadeira untada. Cada banana tem sua própria história, umas podem estar mais maduras, outras maiores, se achar que a massa está mole ainda, (quando caem a colherada se espalha demais) adicione um pouco mais de aveia. Leve ao forno por 15-20 minutos ou até que esteja douradinho. Retire da assadeira e deixe esfriar sobre uma grade. Sirva em seguida, após o resfriamento ou guarde em pote hermético por até 3 dias.");

                    break;

                case "Muffin De Banana":
                    Ingredientes.setText("- 2 bananas-maçã\n- 1 xic aveia batida no liquidificador para ficar mais farinha\n- 1 ovo\n- 4 a 5 col sopa rasa de amêndoas trituradas\n- 1 col sopa mel\n- 2 col sopa óleo de girassol ou de coco\n- 1 col chá cheia de fermento\n- 1 col sobremesa semente de linhaça");

                    Preparo.setText("Bata as bananas com o ovo e o óleo, depois acrescente o mel e bata novamente. Numa tigela, misture a aveia com a amêndoa e a linhaça. Acrescente o líquido e incorpore. Nesse momento, se precisar coloque 1 col a mais de amêndoa. Por último, coloque o fermento e mexa até incorporar. Polvilhe amêndoas triturada com canela e asse por 25′ à 180 graus.");

                    break;

            }

        Ingredientes.setMovementMethod(new ScrollingMovementMethod());
        Preparo.setMovementMethod(new ScrollingMovementMethod());

    }
}
