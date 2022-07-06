package student_Vladislavs_Solims.homework.lesson_9.level_3.task_13;

abstract  class Car {

        abstract void accelerate();

    }

    class ElectricCar extends Car {

        private int batteryCharge;

        @Override
        void accelerate() {

        }
    }

    class PetrolCar extends Car {

        private double petrolTankCapacity;

        @Override
        void accelerate() {

        }
    }

