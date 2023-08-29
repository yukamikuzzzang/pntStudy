public class Car {
    final String company;
    final String model;
    final String color;

    final int maxSpeed;
    final int rpm;

    final Body body;
    final Engine engine;
    final Tire tire;

    Car(String company, String model, String color, int maxSpeed, int rpm, Body body, Engine engine, Tire tire) {
        if (company == null) {
            throw new NullPointerException("제조회사명을 입력해주세요.");
        }
        if (model == null) {
            throw new NullPointerException("모델명을 입력해주세요.");
        }
        if (color == null) {
            throw new NullPointerException("색깔을 입력해주세요.");
        }
        if (maxSpeed < 0) {
            throw new IllegalArgumentException("최고속도는 0보다 커야합니다.");
        }
        if (rpm < 0) {
            throw new IllegalArgumentException("rpm은 0보다 커야합니다.");
        }
        if (body == null) {
            throw new NullPointerException("차체에 대한 정보를 입력해주세요.");
        }
        if (engine == null) {
            throw new NullPointerException("엔진에 대한 정보를 입력해주세요.");
        }
        if (tire == null) {
            throw new NullPointerException("타이어에 대한 정보를 입력해주세요.");
        }

        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.rpm = rpm;
        this.body = body;
        this.engine = engine;
        this.tire = tire;
    }

    Car addMaxSpeedLimit(final Car speedLimit) {
        final int  maxSpeedLimit = maxSpeed + speedLimit.maxSpeed;
        return new Car(company, model, color, maxSpeedLimit, rpm, body, engine, tire);
    }

    Car changeCompanyName(final Car name){
        return new Car(name.company, model, color, maxSpeed, rpm, body, engine, tire);
    }
}
