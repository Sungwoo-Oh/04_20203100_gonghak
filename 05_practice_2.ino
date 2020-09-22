#define PIN_LED 7
unsigned int i;

void setup() {
  pinMode(PIN_LED, OUTPUT);
  Serial.begin(115200); // Initialize serial port
  while (!Serial) {
    ; // wait for serial port to connect.

  }
  i = 0;
  digitalWrite(PIN_LED, LOW); // turn on LED
}

void loop() {
  delay(1000); // wait for 1,000 milliseconds
  while (i<5) {
  digitalWrite(PIN_LED, HIGH); // turn off LED
  delay(100); // wait for 100 milliseconds
  digitalWrite(PIN_LED, LOW); // turn on LED
  delay(100); // wait for 100 milliseconds
  i = i + 1;
  }
  digitalWrite(PIN_LED, HIGH); // turn off LED
  while(1) {}
}
