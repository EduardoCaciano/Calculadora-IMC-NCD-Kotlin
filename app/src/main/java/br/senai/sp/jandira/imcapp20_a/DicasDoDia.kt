package br.senai.sp.jandira.imcapp20_a

import android.util.Log
import java.util.*

fun getDicaDoDia() : String {

    val dicas = listOf<String>(
        "Reduza alimentos com gordura, açúcar e sal. Tenha sempre frutas, verduras e legumes na alimentação diária.",
        "Inicie uma atividade física. Evite escadas rolantes e elevadores e suba a pé.",
        "Não espere ter sede para beber água. Quando você tem sede, significa que o corpo já está desidratado.",
        "Crie um ritual, deixe o ambiente escuro e silencioso. Quem dorme pouco e tem uma qualidade de sono ruim, tem mais chances de aumentar o peso."
    )

    val sorteio = Random()
    val dica = sorteio.nextInt(dicas.size)

    return dicas[dica]

}

fun getDicaDoDiaNcd() : String {

    val listaDicas = listOf<String>(
        "Procure manter a dieta de segunda à sexta-feira, mas cuidado com os excessos de final de semana. Comer de tudo, mas cuidar com as quantidades.",
        "Quando tiver vontade de beliscar: Primeiro beba 1 copo de água, depois escolha: Gelatina diet/light ou capuccino diet ou chá ou frutas secas, água de coco ou refrigerante diet/light ou refresco diet/light.",
        "Alimentos que podem apresentar consumo livre: Chá ou café (com adoçante), água de coco, refrigerante diet/light, limonada (com adoçante), gelatina diet/light, suco de melão ou melancia (sem açúcar) e hortaliças.",
        "Quando sair para comer fora: Escolher pratos que acompanhem legumes e usar bebida alcoólica com moderação (intercalada com 1 copo de água).",
        "No inverno, é possível substituir saladas cruas por uma excelente salada quente. Refogue verduras ou cozinhe no vapor, mas não por muito tempo, para não perder os nutrientes.",
        "Temperos que emagrecem: Pimenta vermelha (3g/dia), gengibre (1 colher de chá/ dia) e vinagre de maçã (2 colheres de chá/dia) são alimentos termogênicos, capazes de acelerar o metabolismo.",
        "Diuréticos naturais: Quem tem a tendência de reter líquidos, pode amenizar o problema incluindo salsa na dieta. Ela atua no organismo como um diurético natural, ajudando os vasos sanguíneos a eliminar o excesso de líquidos. Pode ser adicionada em sanduíches, sopas e chás.",
        "Uva no lugar do vinho: Segundo pesquisas recentes, o suco de uvas vermelhas também funciona na prevenção de problemas cardiovasculares por ter uma carga de antioxidantes semelhantes ao do vinho tinto.",
        "Comece pela salada: Pessoas que comem saladas antes do almoço consomem 12% menos de calorias do que se fossem direto ao prato principal.",
        "Frutas grelhadas: Para uma sobremesa deliciosa e de baixa caloria, grelhe suas frutas favoritas e acrescente canela.",
        "Beba 2 litros de água por dia entre as refeições.",
        "Uma opção de fruta que não pode faltar diariamente é a maçã, pois protege o coração das doenças cardiovasculares.",
        "Consuma peixe pelo menos 1 vez por semana.",
        "Temperar a salada com 1 colher de sobremesa de azeite de oliva extra virgem.",
        "Consuma alimentos integrais, que são ricos em fibras, retardam a absorção dos carboidratos e são mais nutritivos que os refinados.",
        "Escolha sempre cores variadas de frutas e verduras, pois cada cor representa um tipo diferente de vitamina e esses pigmentos protegem nosso corpo de inúmeras doenças (vitaminas antioxidantes).",
        "Consuma as carnes brancas e magras com mais frequência, como por exemplo, frango, peixe, atum sem óleo e carne de porco magra.",
        "Retire toda a gordura visível das carnes antes de cozinhá-las.",
        "Para preparo das carnes, prefira grelhado, cozido, ensopado ou assado.",
        "Use ovos cozidos e nunca fritos, no máximo 3 vezes por semana, pode ser substituído pela carne.",
        "Procure não abusar da gordura ao preparar alimentos.",
        "Beba muita água durante o dia, mas não durante as refeições, pois atrapalha a digestão e distende o abdômen.",
        "Evite doces como sobremesa, substitua por frutas.",
        "Jamais fique em jejum. Coma a cada 3 a 4 horas.",
        "Evite açúcar e farinha branca.",
        "Evite gorduras animais saturadas encontrados no leite integral, queijos amarelos, creme de leite, banha e pele de aves.",
        "Coma verduras de folhas verde escuras como brócolis, couve, espinafre, pois contém bioflavonoides, substâncias que interferem no metabolismo das gorduras."
    )

    val fraseAleatoria = Random()
    val dicas = fraseAleatoria.nextInt(listaDicas.size)

    return listaDicas[dicas]

}