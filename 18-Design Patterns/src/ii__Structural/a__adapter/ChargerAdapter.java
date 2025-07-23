package ii__Structural.a__adapter;

//Adapter
class ChargerAdapter implements TypeCCharger {
 private OldCharger oldCharger;

 public ChargerAdapter(OldCharger oldCharger) {
     this.oldCharger = oldCharger;
 }

 @Override
 public void chargeWithTypeC() {
     System.out.println("Adapter converting Type-C to Micro-USB...");
     oldCharger.chargeWithMicroUSB();  // Adapter redirects the call
 }
}

