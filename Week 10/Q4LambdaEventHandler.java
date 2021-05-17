/*
4.      Reimplement the following statement using a lambda as the event handler:

slider.valueProperty().addListener(
  new ChangeListener<Number>() {

    @Override
    public void changed(ObservableValue<? extends Number> ov, Number old, Number new){
      System.out.printf("The slider's new value is %s%n", new);
    }
  }
);
*/
