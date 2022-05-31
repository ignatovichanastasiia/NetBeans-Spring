NetBeans project(08). Simple spring program with xml-file and annotations.
Component, Autowired, Qualifier, Value, Scope, PostConstruct, PreDestroy.
Бины, прописанные в  xml - превалируют. Если не убрать прописанные бины в xml, то @Component+@Scope("prototype") не работают. 

Папка для сканирования (component-scan) указывается в xml от папки Java и далее(не включая папку Java). 
В ином случае скан не работает, эксепшен указывает на отсутствие бинов. 

В случае отсутствия аннотаций и прописывания бинов в xml построчно, адрес указывается таким же образом: от папки Java (не включая ее). 
В противном случае будет та же ошибка: отсутствие бинов. 

Xml файл должен лежить строго в папке resources (main/resources), иначе файл нечитаем. 
В NetBeans пришлось создавать папку в ручную, в отличие от Int.Idea, которая содержит нужную папку в шаблоне. 
