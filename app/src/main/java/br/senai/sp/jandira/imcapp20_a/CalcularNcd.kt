package br.senai.sp.jandira.imcapp20_a

import android.util.Log

fun calcularNcd(peso: Double, idade: Int, nivelAtividade: Int, sexo: Char) : Double {

    //***Calculo Ncd Masculino***
    if (sexo == 'm') {

        //Atividade Leve
        if (nivelAtividade == 1) {
            if (idade == 1) {
                return (15.3 * peso + 679) * 1.5
            } else if (idade == 2) {
                return (11.6 * peso + 879) * 1.5
            } else {
                return (13.5 * peso + 487) * 1.5
            }

            //Atividade Moderada
        } else if (nivelAtividade == 2) {
            if (idade == 1) {
                return (15.3 * peso + 679) * 1.8
            } else if (idade == 2) {
                return (11.6 * peso + 879) * 1.8
            } else {
                return (13.5 * peso + 487) * 1.8
            }

            //Atividade Intensa
        } else if (nivelAtividade == 3) {
            if (idade == 1) {
                return (15.3 * peso + 679) * 2.1
            } else if (idade == 2) {
                return (11.6 * peso + 879) * 2.1
            } else {
                return (13.5 * peso + 487) * 2.1
            }
        }

//------------------------------------------------------------//
            //***Calculo Ncd Feminino***
        } else {
            //Atividade Leve
            if (nivelAtividade == 1) {
                if (idade == 1) {
                    return (14.7 * peso + 496) * 1.6
                } else if (idade == 2) {
                    return (8.7 * peso + 829) * 1.6
                } else {
                    return (10.5 * peso + 596) * 1.6
                }

                //Atividade Moderada
            } else if (nivelAtividade == 2) {
                if (idade == 1) {
                    return (14.7 * peso + 679) * 1.6
                } else if (idade == 2) {
                    return (8.7 * peso + 879) * 1.6
                } else {
                    return (10.5 * peso + 487) * 1.6
                }

                //Atividade Intensa
            } else if (nivelAtividade == 3) {
                if (idade == 1) {
                    return (14.7 * peso + 679) * 1.8
                } else if (idade == 2) {
                    return (8.7 * peso + 879) * 1.8
                } else {
                    return (10.5 * peso + 487) * 1.8
                }
            }
        }
    return 0.0
}













