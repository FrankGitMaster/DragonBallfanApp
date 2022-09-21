/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon.ball.fanapp;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author frank
 */
public class DragonBallFanApp {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        // Clase Saga
        // - Objetos
        Saga dragonBall = new Saga(1, "La saga de Dragon Ball describe las aventuras de Gokū, un guerrero saiyajin, experto en artes marciales que en su infancia inicia sus viajes y aventuras en las que pone a prueba y mejora\nsus habilidades de pelea, enfrentando oponentes y protegiendo a la Tierra de otros seres que quieren conquistarla y exterminar a la humanidad. Conforme transcurre la trama,\nconoce a otros personajes que le ayudan en este propósito. Con la existencia de unas esferas mágicas que al ser reunidas invocan a un dragón que concede deseos que en varias\nocasiones resultan útiles tanto para Gokū y sus amigos como para la humanidad, aunque también son procuradas de forma constante por algunos seres malignos.", "Dragon Ball", 1986, 153);
        Saga dragonBallZSagaSayayin = new Saga(2, "Cinco años después de la pelea contra Pikoro, Goku se encuentra viviendo felizmente con Milk en la Montaña Paoz; Incluso tienen un hijo, llamado Gohan, de cuatro años.\nTodo parece estar en paz, hasta que dos extraterrestres llamados Raditz y Nappa llegan a la Tierra preguntando por un tal Kakaroto el cual fue enviado a la tierra para eliminar\na todos los habitantes. Goku no entiende nada aunque Raditz, le explica que su verdadero nombre es Kakaroto y que debe cumplir su mision. Goku lo niega todo y es aqui donde\ncomienza la batalla contra los extraterrestres Raditz, Nappa y Vegeta.", "Dragon Ball Z - Saga de los Sayayin", 1989, 35);
        Saga dragonBallZSagaFreezer = new Saga(3, "La saga de Freezer corresponde a la segunda saga argumental de Dragon Ball Z, que abarca de los episodios 36 hasta el 107. Comienza desde el viaje de Bulma, Gohan y Krilin\nhacia el planeta Namekusei en busca de las Esferas del Dragon Namekianas para resucitar a sus amigos muertos en el combate contra Raditz, Nappa y Vegeta. Un extraterrestre\nllamado Freezer tambien esta en busca de las esferas para conseguir la vida eterna, pero se encuentra con Bulma, Gohan y Krilin los cuales hacen lo imposible para evitar que\nalcance su objetivo, pero Freezer ordena a sus hombres buscarlos y exterminarlos. Posteriormente aparece Goku para ayudar a sus compañeros ya heridos y empezar\nuna batalla con el poderoso Freezer.  ", "Dragon Ball Z - Saga de Freezer", 1990, 72);
        // - Lista de objetos
        List<Saga> listaSagas = new ArrayList<>();
        listaSagas.add(dragonBall);
        listaSagas.add(dragonBallZSagaSayayin);
        listaSagas.add(dragonBallZSagaFreezer);

        // Clase Planeta
        // - Objetos
        Planeta tierra = new Planeta(1, "La Tierra es designado como el planeta 4032-Verde-877, estando en el borde de la Vía Láctea en el lejano extremo de las Galaxias del Norte, formando parte del Séptimo Universo.\nLos acontecimientos que ocurren en este planeta están vigilados por Kaio del Norte, el Gran Kaio y los Kaio-shin.", "Tierra", "Terrícola", "Rey de la Tierra");
        Planeta namekusei = new Planeta(2, "Es un planeta en un sistema solar triple ubicado en las coordenadas 9045XY. Es el planeta de origen de Kami-Sama, Pikoro Daimaku, Dende y todos los namekianos.El planeta fue\ndestruido por la ira de Freezer el 24 de diciembre del año 762. Los namekianos se trasladaron a Nuevo Namek después de refugiarse en la Tierra durante casi un año.", "Namekusei", "Namekiano", "Gran Patriarca");
        Planeta pVegeta = new Planeta(3, "El planeta Vegeta, es un planeta rocoso localizado en la Vía Láctea de las Galaxias del Norte del Universo 7 hasta su destrucción a manos de Freezer en los años 737-739.\nEl Planeta Vegeta parece una tierra llena de desiertos con un cielo amarillo/rojo en lugar de azul. Aparentemente tiene dos satélites naturales, y hay luna llena cada 100 años.\nSe sabe que tiene 10 veces más gravedad que la Tierra.", "Vegeta", "Sayayin", "Rey vegeta");
        Planeta freezer79 = new Planeta(4, "El planeta Freezer #79 es un planeta dominado por Freezer. Los únicos habitantes que se ven en el planeta son hombres bajo el mando de Freezer. Este planeta también\nparece ser una base de operaciones en el imperio de Freezer.", "Freezer #79", "Desconocida", "Freezer");
        Planeta arlia = new Planeta(5, "El planeta está cubierto de ruinas y edificios en ruinas, así como el palacio, y la atmósfera es negra y fea. Fue destruido por Nappa y Vegeta en febrero del año 762 mientras\nviajaban a la Tierra, posiblemente como uno de sus trabajos para el Ejército Galáctico de Freezer.", "Arlia", "Arliano", "Rey Moái");
        Planeta sagrado = new Planeta(6, "El Planeta Sagrado es donde vivieron los cuatro Kais y el Gran Supremo Kai, y posiblemente donde vivieron todos los demás Kais. El planeta tiene varias lunas y florece con\nvida, con varios peces en sus ríos. También hay áreas cubiertas de hierba y rocas, y también hay casquetes polares. El Planeta de los Kaioshin es increíblemente sagrado,\nliteralmente hasta el punto en que, excepto en situaciones extremas como la liberación de Majin Buu, ni siquiera el Gran Kai puede ir allí. El planeta parece ser un lugar\nbastante vacío para un planeta grande, ya que pocas personas residen en él. Esto podría deberse al valor sagrado del planeta, o porque es difícil llegar allí.", "Sagrado", "Kaioshin / Especie nativa: Nucleicos ", "Gran Kaioshin");
        // - Lista de objetos
        List<Planeta> listaPlanetas = new ArrayList<>();
        listaPlanetas.add(tierra);
        listaPlanetas.add(namekusei);
        listaPlanetas.add(pVegeta);
        listaPlanetas.add(freezer79);
        listaPlanetas.add(arlia);
        listaPlanetas.add(sagrado);

        // Clase Personaje
        // - Objetos
        Personaje goku = new Personaje(0, 1, "Su nombre real y de nacimiento es Kakaroto y es uno de los pocos sayayines que lograron sobrevivir a la destrucción total del Planeta Vegeta del Universo 7. Es el segundo hijo\nde Bardock y Gine, hermano menor de Raditz, nieto adoptivo de Son Gohan, esposo de Milk, padre de Son Gohan y Son Goten, a su vez también es el abuelo de Pan y ancestro\nde Son Goku Jr.", "Kakaroto / Son Goku", "Vegeta", "Sayayin", "", "Dragon Ball", "Genkidama", "Kamehameha", "Teletransportación", "Súper Sayayin", "Súper Sayayin fase 2", "Súper Sayayin fase 3", "Súper Sayayin fase 4");
        Personaje gohan = new Personaje(0, 2, "El nombre fue dado en honor a su bisabuelo adoptivo. Cuando era un recién nacido, Milk quería que se llamara Einstein, pero ese nombre le disgustó, manifestándolo con un llanto,\na lo que el Rey Gyuma vio cómo el bebé, al escuchar el nombre de Gohan se reía y por esa razón se llamó de esa manera.", "Son Gohan", "Tierra", "50% Terrícola, 50% Sayayin", "", "Dragon Ball Z", "Kamehameha", "Masenko", "Bakuretsu Ranma", "Ozaru", "Súper Sayayin", "Súper Sayayin fase 2", "");
        Personaje vegeta = new Personaje(0, 3, "Vegeta IV reconocido como el Príncipe Vegeta y conocido mayormente como Vegeta es el hijo mayor del rey Vegeta III, así como el príncipe más reciente de la familia real sayayin y\nuno de los pocos supervivientes tras el genocidio sayayin del planeta Vegeta del Universo 7, a manos de Freezer. Es el eterno rival de Son Goku, el esposo de Bulma,\npadre de Trunks y Bra y ancestro de Vegeta Jr.", "Vegeta", "Vegeta", "Sayayin", "", "Dragon Ball Z", "Cañon cósmico", "Explosión final", "Ataque del Big Bang", "Ozaru", "Súper Sayayin", "Súper Sayayin fase 2", "");
        Personaje pikoro = new Personaje(0, 4, "Pikoro o Pikoro Jr. es un namekiano que surgió tras ser creado en los últimos momentos de vida de su padre, siendo su actual reencarnación. Aunque en un principio fue el\narchienemigo de Son Goku, con el paso del tiempo fue haciéndose menos malvado hasta finalmente convertirse en un ser bondadoso y miembro de los Guerreros Z. A través del\ntiempo, también comenzó a tomarle cariño a su discípulo Son Gohan, a quien veía como una especie de ´vástago´ y formando un lazo de amistad con este.", "Pikoro", "Namekusei", "Namekiano", "", "Dragon Ball", "Ataque místico", "Regeneración", "Makankosappo", "Gran namekiano", "Súper namekiano fusión 1", "Súper namekiano fusión 2", "");
        // - Lista de objetos
        List<Personaje> listaPersonajes = new ArrayList<>();
        listaPersonajes.add(goku);
        listaPersonajes.add(gohan);
        listaPersonajes.add(vegeta);
        listaPersonajes.add(pikoro);
        // Clase Productor
        // - Objetos
        Productor akiraToriyama = new Productor(1, "Akira Toriyama", "67 años", "Japón", "Autor original");
        Productor kozomorishita = new Productor(2, "Kozo Morishita", "74 años", "Japón", "Productor ejecutivo");
        Productor kenjiShimizu = new Productor(3, "Kenji Shimizu", "61 años", "Japón", "Productor");
        Productor takaoKoyama = new Productor(4, "Takao Koyama", "74 años", "Japón", "Composición de la serie");
        Productor minoruMaeda = new Productor(5, "Minoru Maeda", "68 años", "Japón", "Diseño de personajes");
        // - Lista de objetos
        List<Productor> listaProductores = new ArrayList<>();
        listaProductores.add(akiraToriyama);
        listaProductores.add(kozomorishita);
        listaProductores.add(kenjiShimizu);
        listaProductores.add(takaoKoyama);
        listaProductores.add(minoruMaeda);
        
        //PROGRAMA
        System.out.println("DRAGON BALL Z FAN APP\n");
        System.out.println("Dragon Ball Z fanApp es una plataforma web dirigida a los usuarios que desean tener conocimientos adicionales de la serie más allá de solo la historia.\nDragon Ball es una serie animada japonesa del género acción, aventuras y fantasía transmitida por primera vez por el canal televisivo Fuji Television\nen Japón en 1986.");
        // Objeto clase Scanner para la lectura de los datos del usuario
        Scanner leer = new Scanner(System.in);
        // Se declara la variable opcion
        int opcion;
        do {
            // Menú principal
            System.out.println("\nMENÚ: (Digite el número que corresponda a la opción del menú a la que desea ingresar)\n1. SAGAS\n2. PLANETAS\n3. PERSONAJES\n4. PRODUCCIÓN\n5. SALIR DEL PROGRÁMA");
            // La variable opcion almacena el dato ingresado por el usuario
            opcion = leer.nextInt();
            // Las opciones del menu se acceden mediante un switch
            switch (opcion) {
                // El case 1 corresponde a acceder a las sagas
                case 1:
                    System.out.println("\nSAGAS: (Digite el número que corresponda a la saga que desea consultar o para salir al menú principal)");
                    // Se recorre la lista que contiene los objetos de la clase Saga
                    for (Saga objetoSaga : listaSagas) {
                        // Se imprime el nombre de cada objeto/saga junto con su id correspondiente para listarlos
                        System.out.println(objetoSaga.idSaga + ". " + objetoSaga.nombreSaga);
                    }
                    // Se calcula el tamaño de listaSagas y se suma 1 para imprimir la opcion Salir con un numero indice mayor que el de los objetos
                    System.out.println(listaSagas.size() + 1 + ". Salir");
                    // Se inicializa la variable seleccionarSaga para capturar los datos que ingrese el usuario
                    int seleccionarSaga = leer.nextInt();
                    // Si el valor ingresado por el usuario es diferente al numero correspondiente a la opcion salir, el programa se ejecuta, de lo contrario se regresa al menú principal
                    if (seleccionarSaga != listaSagas.size() + 1) {
                        // Se recorre la lista que contiene los objetos de la clase Saga
                        for (Saga objetoSaga : listaSagas) {
                            // La condición es que el valor ingresado por el usuario sea igual al id de un objeto de la clase
                            if (seleccionarSaga == objetoSaga.idSaga) {
                                // Se declara la varibale opcionSeleccionarMetodo
                                int opcionSeleccionarMetodo;
                                do {
                                    // Menú para la selección de metodos/funciones que ejecuta la clase Saga
                                    System.out.println("\nMENÚ DE " + objetoSaga.nombreSaga.toUpperCase() + ": (Digite el número que corresponda a la opción del menú a la que desea ingresar)\n1. Ver resumen\n2. Ver información\n3. Salir");
                                    // La variable opcionSeleccionarMetodo almacena el dato ingresado por el usuario
                                    opcionSeleccionarMetodo = leer.nextInt();
                                    // Las opciones del menu de métodos se acceden mediante un switch
                                    switch (opcionSeleccionarMetodo) {
                                        // Cada case corresponde a un metodo
                                        case 1:
                                            objetoSaga.verResumen();
                                            break;
                                        case 2:
                                            objetoSaga.verInformacionSaga();
                                            break;
                                    }
                                    // El menú creado con el switch se ejecuta mientras que la opcion seleccionada por el usuario no sea igual a 3
                                } while (opcionSeleccionarMetodo != 3);
                            }
                        }
                    } else {
                        // Se termina el case 1
                        break;
                    }
                    break;
                // El case 2 corresponde a acceder a los planetas
                case 2:
                    System.out.println("\nPLANETAS: (Digite el número que corresponda al planeta que desea consultar o para salir al menú principal)");
                    // Se recorre la lista que contiene los objetos de la clase Planeta
                    for (Planeta objetoPlaneta : listaPlanetas) {
                        // Se imprime el nombre de cada objeto/planeta junto con su id correspondiente para listarlos
                        System.out.println(objetoPlaneta.idPlaneta + ". " + objetoPlaneta.nombrePlaneta);
                    }
                    // Se calcula el tamaño de listaPlanetas y se suma 1 para imprimir la opcion Salir con un numero indice mayor que el de los objetos
                    System.out.println(listaPlanetas.size() + 1 + ". Salir");
                    // Se inicializa la variable seleccionarPlaneta para capturar los datos que ingrese el usuario
                    int seleccionarPlaneta = leer.nextInt();
                    // Si el valor ingresado por el usuario es diferente al numero correspondiente a la opcion salir, el programa se ejecuta, de lo contrario se regresa al menú principal
                    if (seleccionarPlaneta != listaPlanetas.size() + 1) {
                        // Se recorre la lista que contiene los objetos de la clase Planeta
                        for (Planeta objetoPlaneta : listaPlanetas) {
                            // La condición es que el valor ingresado por el usuario sea igual al id de un objeto de la clase
                            if (seleccionarPlaneta == objetoPlaneta.idPlaneta) {
                                // Se declara la varibale opcionSeleccionarMetodo
                                int opcionSeleccionarMetodo;
                                do {
                                    // Menú para la selección de metodos/funciones que ejecuta la clase Planeta
                                    System.out.println("\nMENÚ DEL PLANETA " + objetoPlaneta.nombrePlaneta.toUpperCase() + ": (Digite el número que corresponda a la opción del menú a la que desea ingresar)\n1. Ver descripción\n2. Ver información\n3. Salir");
                                    // La variable opcionSeleccionarMetodo almacena el dato ingresado por el usuario
                                    opcionSeleccionarMetodo = leer.nextInt();
                                    // Las opciones del menu de métodos se acceden mediante un switch
                                    switch (opcionSeleccionarMetodo) {
                                        // Cada case corresponde a un metodo
                                        case 1:
                                            objetoPlaneta.verDescripcionPlaneta();
                                            break;
                                        case 2:
                                            objetoPlaneta.verInformacionPlaneta();
                                            break;
                                    }
                                    // El menú creado con el switch se ejecuta mientras que la opcion seleccionada por el usuario no sea igual a 3
                                } while (opcionSeleccionarMetodo != 3);
                            }
                        }
                    } else {
                        // Se termina el case 1
                        break;
                    }
                    break;
                // El case 3 corresponde a acceder a los personajes
                case 3:
                    System.out.println("\nPERSONAJES: (Digite el número que corresponda al personaje que desea consultar o para salir al menú principal)");
                    // Se recorre la lista que contiene los objetos de la clase Personaje
                    for (Personaje objetoPersonaje : listaPersonajes) {
                        // Se imprime el nombre de cada objeto/personaje junto con su id correspondiente para listarlos
                        System.out.println(objetoPersonaje.idPersonaje + ". " + objetoPersonaje.nombrePersonaje);
                    }
                    // Se calcula el tamaño de listaPersonajes y se suma 1 para imprimir la opcion Salir con un numero indice mayor que el de los objetos
                    System.out.println(listaPersonajes.size() + 1 + ". Salir");
                    // Se inicializa la variable seleccionarPersonaje para capturar los datos que ingrese el usuario
                    int seleccionarPersonaje = leer.nextInt();
                    // Si el valor ingresado por el usuario es diferente al numero correspondiente a la opcion salir, el programa se ejecuta, de lo contrario se regresa al menú principal
                    if (seleccionarPersonaje != listaPersonajes.size() + 1) {
                        // Se recorre la lista que contiene los objetos de la clase Personaje
                        for (Personaje objetoPersonaje : listaPersonajes) {
                            // La condición es que el valor ingresado por el usuario sea igual al id de un objeto de la clase
                            if (seleccionarPersonaje == objetoPersonaje.idPersonaje) {
                                // Se declara la varibale opcionSeleccionarMetodo
                                int opcionSeleccionarMetodo;
                                do {
                                    // Menú para la selección de metodos/funciones que ejecuta la clase Personaje
                                    System.out.println("\nMENÚ DE " + objetoPersonaje.nombrePersonaje.toUpperCase() + ": (Digite el número que corresponda a la opción del menú a la que desea ingresar)\n1. Ver descripción\n2. Ver información\n3. Ver poderes\n4. Ver fases\n5. Salir");
                                    // La variable opcionSeleccionarMetodo almacena el dato ingresado por el usuario
                                    opcionSeleccionarMetodo = leer.nextInt();
                                    // Las opciones del menu de métodos se acceden mediante un switch
                                    switch (opcionSeleccionarMetodo) {
                                        // Cada case corresponde a un metodo
                                        case 1:
                                            objetoPersonaje.verDescripcionPersonaje();
                                            break;
                                        case 2:
                                            objetoPersonaje.verInformacionPersonaje();
                                            break;
                                        case 3:
                                            objetoPersonaje.verPoderes();
                                            break;
                                        case 4:
                                            objetoPersonaje.verFases();
                                            break;
                                    }
                                    // El menú creado con el switch se ejecuta mientras que la opcion seleccionada por el usuario no sea igual a 3
                                } while (opcionSeleccionarMetodo != 5);
                            }
                        }
                    } else {
                        // Se termina el case 1
                        break;
                    }
                    break;
                // El case 4 corresponde a acceder a los productores
                case 4:
                    System.out.println("\nPRODUCTORES: (Digite el número que corresponda al productor que desea consultar o para salir al menú principal)");
                    // Se recorre la lista que contiene los objetos de la clase Productor
                    for (Productor objetoProductor : listaProductores) {
                        // Se imprime el nombre de cada objeto/productor junto con su id correspondiente para listarlos
                        System.out.println(objetoProductor.idProductor + ". " + objetoProductor.nombreProductor);
                    }
                    // Se calcula el tamaño de listaProductores y se suma 1 para imprimir la opcion Salir con un numero indice mayor que el de los objetos
                    System.out.println(listaProductores.size() + 1 + ". Salir");
                    // Se inicializa la variable seleccionarProductor para capturar los datos que ingrese el usuario
                    int seleccionarProductor = leer.nextInt();
                    // Si el valor ingresado por el usuario es diferente al numero correspondiente a la opcion salir, el programa se ejecuta, de lo contrario se regresa al menú principal
                    if (seleccionarProductor != listaProductores.size() + 1) {
                        // Se recorre la lista que contiene los objetos de la clase Productor
                        for (Productor objetoProductor : listaProductores) {
                            // La condición es que el valor ingresado por el usuario sea igual al id de un objeto de la clase
                            if (seleccionarProductor == objetoProductor.idProductor) {
                                // Se declara la varibale opcionSeleccionarMetodo
                                int opcionSeleccionarMetodo;
                                do {
                                    // Menú para la selección de metodos/funciones que ejecuta la clase Productor
                                    System.out.println("\nMENÚ DE " + objetoProductor.nombreProductor.toUpperCase() + ": (Digite el número que corresponda a la opción del menú a la que desea ingresar)\n1. Ver información\n2. Salir");
                                    // La variable opcionSeleccionarMetodo almacena el dato ingresado por el usuario
                                    opcionSeleccionarMetodo = leer.nextInt();
                                    // Las opciones del menu de métodos se acceden mediante un switch
                                    switch (opcionSeleccionarMetodo) {
                                        // Cada case corresponde a un metodo
                                        case 1:
                                            objetoProductor.verInformacionProductor();
                                            break;
                                    }
                                    // El menú creado con el switch se ejecuta mientras que la opcion seleccionada por el usuario no sea igual a 3
                                } while (opcionSeleccionarMetodo != 2);
                            }
                        }
                    } else {
                        // Se termina el case 1
                        break;
                    }
                    break;
            }
        } while (opcion != 5);
        System.out.println("EL PROGRAMA HA FINALIZADO");
    }

}