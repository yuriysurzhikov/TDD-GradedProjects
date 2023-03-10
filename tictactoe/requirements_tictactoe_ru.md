<h2 align="center">Крестики-Нолики</h2>
<h4>Игра Крестики-Нолики двух пользовательская игра, в которой игроки один за другим ставят в
ячейки на поле либо "крестик", если игрок играет за крестики, либо "нолик", если игрок
играет за нолик. </h4>
<h4>Выигрывает тот, кто первым составит выигрышную комбинацию из трех соответствующих символов
подряд. Выигрышные комбинации либо в ряд три одинаковых символа, либо по диагонали. </h4>

Техническое задание:
Необходимо реализовать приложения с возможностью играть через Bluetooth двум игрокам.

0. В приложении должен быть стартовый экран с кнопками: "Игра по bluetooth", "игра с компьютером",
   "игра на одном устройстве".
    1. На этом экране должен быть логотип игры.
    2. При нажатии на "Игра по bluetooth", должен запускаться экран подключения к Bluetooth
       устройству.
    3. При нажатии на "игра с компьютером" открывается экран с игрой, и запускается игра с
       компьютером.
    4. При нажатии на "игра на одном устройстве" открывается экран с игрой, где первым ходит
       крестик.
1. В приложении должен быть экран с вожможностью соединиться через Bluetooth со вторым игроком.
    1. Экран должен иметь кнопку поиска устройств поблизости.
    2. При нажатии на кнопку должны отображаться доступные для подключения устройства.
        1. Устройство должно быть телефоном
        2. Устройство должно иметь установленное приложение для возможности играть.
        3. В случае если пункты 1.2.1 и 1.2.2 невозможно выполнить, устройство не должно
           отборажаться в списке доступных устройств для подключения.
    3. При нажатии на устройство должно выполняться подключение к устройству второго пользователя.
        1. Если подключение не удалось установить необходимо показать текстовое сообщение о том,
           что произошла ошибка подключения.
        2. Если подключение прошло успешно, на устройстве игрока, который инициировал совместную
           игру, каждому из игроков присваивается роль, за которую он играет: либо крестик, либо
           нолик.
        3. После того, как роли назначены, на каждом из приложений открывается экран с игрой.
2. В приложении должен быть экран для самой игры.
    1. На экране должно быть поле с ячейками 3х3, для возможности поставить крестик или нолик.
    2. Первым ходит игрок, играющий за крестики.
    3. В момент хода игрока отправляется событие в контроллер игры, о том, что игрок походил.
       Событие содержит в себе тип игрока и его координаты хода.
    4. Контроллер того игрока, который делает ход, проверяет завершена ли игра - есть ли
       выигрышная комбинация.
        1. Если кобинация выигрышная, то игра заканчивается, и второму игроку отправляется
           событие о том, что игра завершена с выиграшем противоположной стороны.
        2. Если комбинация не выигрышная, то второму игроку отправляется событие о его
           очереди ходить.
        3. Если комбинация ничейная - нет больше доступных клеток, для того, чтобы походить,
           то обоим игрокам приходит событие о том, что игра завершена.
    5. Если пользователь не делает ход в течении 90 секунд, игра обрывается, и второму
       игроку присваивается победа.
    6. При завершении игры открывается экран 3.
3. В приложении должен быть экран с результатом игры.
    1. Экран должен содержать название игрока, который победил: либо "крестик", либо "нолик".
    2. Для того игрока, который победил должна проиграться анимация феерверка, или конфети.
    3. На экране должна быть кнопка "Повторить".
        1. При нажатии на кнопке "Повторить" создается новая игра, то происходят действия начиная с
           п. 1.3.2.
    4. На экране должна быть кнопка закончить или закрыть игру.
        1. При нажатии на кнопку закрывается подключение через bluetooth.
        2. После закрытия подключения пользователя перекидывает на стартовый экран 0.
4. Экраны для игры по bluetooth, игры на одном устройстве и игры с компьютером должны быть разными
   Activity, с общей логикой, для большей абстракции.
5. Контроллер для игры не должен знать о том, каким способом играют игроки. Новый контроллер
   должен создаваться при старте игры.