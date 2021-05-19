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

// This should be pretty close ... need to create a simple GUI with a JSlider to check ...

slider.valueProperty().addListener( (ov, oldValue, newValue) ->
                                    { System.out.printf("The slider's new value is %s%n", newValue); }
                                   );

