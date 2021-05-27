package interf;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class lab extends JFrame
{
    private JButton lol3 = new JButton("Список клиентов"); // кнопка просмотра клиентов
    private JButton lol2 = new JButton("Список товаров"); // кнопка просмотра товаров
    private JButton lol = new JButton("Информация о программе"); // кнопка о программе
    private JButton button = new JButton("Вывести товар"); // кнопка проверить
    private JTextField input = new JTextField("", 10); // поле для ввода текста
    private JLabel label = new JLabel("Введите товар который вы хотите просмотреть -\n"); // текстовая строка, с подписью

    public lab ()
    {
        super ("Ломбард"); //Название приложения
        this.setBounds( 100, 150, 1250, 150); // задание размеров главного окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //оформление окна приложения

        Container container = this.getContentPane(); //создание контейнера
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label); // контерйнер с текстом внутри, используется для расположения
        container.add(input); // контейнер с полем для ввода текста


        button.addActionListener(new ButtonEventListener()); // проверка кнопки на нажатие
        container.add(button);

        lol.addActionListener(new lol()); // проверка кнопки на нажатие
        container.add(lol);

        lol2.addActionListener(new lol2()); // проверка кнопки на нажатие
        container.add(lol2);

        lol3.addActionListener(new lol3()); // проверка кнопки на нажатие
        container.add(lol3);
    }


    // класс с выводом окна с информацией после нажатия на кнопку

    class lol implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String message = ""; // строка для информации
            message += "Герасюк Богдан \n" + "Тема практики: \n" +"Ювелирная мастерская"; // добавления информации в строку
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE); // демонтстрация окна с информацией
        }
    }
    //


    // класс с выводом окна с информацией после нажатия на кнопку
    class lol2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String message = ""; // строка для информации

            message +=
                    "Помолвочное кольцо из золота 585 пробы со Swarovski Zirconia - цена - 10 430 ₽ количество - 1   \n" +
                    "Кольцо из золота с бриллиантом и керамической вставкой - цена - 9 230 ₽ количество - 0 \n" +
                    "Брошь «Кошка» с агатом и жемчугом - цена - 27 890 ₽ количество - 8\n"+
                    "Помолвочное кольцо c бриллиантом - цена - 30 290 ₽ количество на складе - 3 \n" ; // добавления информации в строку

            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE); // демонтстрация окна с информацией
        }
    }
    //


    // класс с выводом окна с информацией после нажатия на кнопку
    class lol3 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String message = ""; // строка для информации

            message +=
                            "Джалилов Амиль Азер оглы - заказал - Помолвочное кольцо из золота  - итог  10 000₽  \n" +
                            "Герасюк Богдан - заказал золотую цепь - итог 5 000₽  \n" +
                            "Лотков Константин - заказал Брошь «Кошка» - итог 30 000₽\n"+
                            "Захаров Марк - заказл Кольцо из золота - итог 15 000₽ \n" ; // добавления информации в строку

            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE); // демонтстрация окна с информацией
        }
    }
    //



    // класс с выводом окна с информацией после нажатия на кнопку
    class ButtonEventListener implements ActionListener
    {

        public void actionPerformed (ActionEvent e)
        {
            String message = ""; // строка для информации
            message += "Ниже будет выведен товар, который вы ищете \n" ; // добавления информации в строку
            message += "Введённый товар - " + input.getText()+ "\nКольцо из золота с бриллиантом и керамической вставкой - цена - 9 230 ₽ количество - 0 "  ; // добавления информации в строку
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE); // демонтстрация окна с информацией
        }

    }
    //


}


