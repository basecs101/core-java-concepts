
class Machine{

}

class Mobile extends Machine{

}

class Computer extends Machine{

}

class Hardware<E extends Machine>{

}
public class BoundedGenericsExample {
    Hardware<Machine> machineHardware = new Hardware<>();
    Hardware<Mobile> mobileHardware = new Hardware<>();
    Hardware<Computer> computerHardware = new Hardware<>();
}
