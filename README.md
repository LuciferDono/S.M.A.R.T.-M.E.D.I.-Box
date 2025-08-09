# S.M.A.R.T. M.E.D.I. BOX

**Smart Medication Assistance & Reminder Technology for Monitoring, Efficient Dispensing, and Intelligent Box**

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![Arduino](https://img.shields.io/badge/Arduino-Compatible-blue.svg)](https://www.arduino.cc/)
[![Status](https://img.shields.io/badge/Status-Prototype-orange.svg)]()

---

## 🏥 Project Overview

The **S.M.A.R.T. M.E.D.I. BOX** is an **IoT-enabled, intelligent medication dispenser** designed to enhance medication adherence among elderly and chronically ill patients.  

This embedded system integrates **RFID/NFC authentication**, **real-time monitoring**, and **automated caregiver alerts**, offering **secure, timely, and reliable** medication dispensing — far beyond traditional pill organizers.

---

## ✨ Key Features

- **🔐 Secure Authentication** – RFID/NFC-based patient verification
- **⏰ Automated Dispensing** – Precise pill release at scheduled times
- **📱 SMS Alerts** – Notifies caregivers for missed doses
- **🆘 Emergency Support** – SOS button sends immediate alerts
- **🔋 Dual Power Supply** – Battery backup for continuous use
- **📟 Easy Interface** – LCD display with button navigation

---

## 🎯 Problem Statement

Elderly and chronically ill patients face significant challenges in medication adherence due to memory loss, visual impairment, and complex medication regimens. Non-adherence leads to serious health complications, increased hospitalizations, and higher healthcare costs[1]. Traditional pill organizers lack automation, real-time monitoring, and caregiver notification capabilities.

**Consequences:**
- Increased hospitalizations  
- Severe health deterioration  
- Higher healthcare costs  

Traditional pill boxes **lack** automation, monitoring, and real-time caregiver notifications.  
The **S.M.A.R.T. M.E.D.I. BOX** addresses all these gaps.

---

## 🔧 Technical Specifications

### **Hardware**
| Component | Purpose |
|-----------|---------|
| **Microcontroller** | 2× Arduino Uno (Master–Slave setup) |
| **Authentication** | RFID/NFC Module |
| **Timing** | DS1302 RTC Module |
| **Communication** | GSM SIM800L Module |
| **Sensors** | IR Sensor for pill pickup |
| **Actuators** | 3× Stepper Motors |
| **Interface** | 16×2 LCD, Buzzer, Push Buttons |
| **Power** | 12V Battery + AC Adapter |

### **Software**
- **Arduino IDE** (v1.8.0+)
- Libraries:
  - `LiquidCrystal_I2C`
  - `Stepper`
  - `SoftwareSerial`
  - `DS1302`
- **Language:** C/C++ (Arduino)

---

## 🚀 Getting Started

### **Prerequisites**
```

* Arduino IDE installed
* Required Arduino libraries (see /src/arduino/libraries/)
* All hardware components (see /hardware/components-list.md)

````

### **Setup Steps**
1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/SMART-MEDI-BOX.git
   cd SMART-MEDI-BOX
````

2. **Install Libraries**

   * Open Arduino IDE → `Sketch` → `Include Library` → `Manage Libraries`
   * Install:

     * LiquidCrystal\_I2C
     * Stepper
     * SoftwareSerial
3. **Assemble Hardware**

   * Use diagrams in `/hardware/circuit-schematics/`
   * Match wiring to `/hardware/components-list.md`
4. **Upload Code**

   * Open `/src/arduino/smart_medi_box.ino`
   * Select **Arduino Uno** & correct COM port
   * Upload

---

## 💡 How It Works

**Workflow:**

```
Initialization → Schedule Input → RFID Authentication → Dispensing → Pickup Detection → Alerts
```

**Key Operations:**

1. **RFID Check** – Patient verifies identity
2. **RTC Trigger** – Medication release at set time
3. **Motor Actuation** – Dispenses correct dosage
4. **Pickup Monitoring** – IR sensor detects pill retrieval
5. **Alert System** – SMS sent if pill is not collected
6. **SOS Feature** – Sends immediate caregiver alert

---

## 📊 System Components

| Component      | Function                  |
| -------------- | ------------------------- |
| Arduino Uno    | Controls logic & hardware |
| DS1302 RTC     | Manages schedules         |
| RFID Module    | Patient verification      |
| Stepper Motors | Pill dispensing           |
| GSM Module     | SMS alerts                |
| IR Sensor      | Pill pickup detection     |
| LCD + Buttons  | User interface            |

---

## 🎯 Target Use Cases

* Elderly living alone
* Nursing homes & rehabilitation centers
* Chronic disease patients
* Remote health monitoring

---

## ⚙️ Configuration

### **Example Schedule**

```cpp
TIME_SLOT morning = {8, 0};    // 8:00 AM
TIME_SLOT afternoon = {14, 0}; // 2:00 PM
TIME_SLOT evening = {20, 0};   // 8:00 PM
```

### **RFID Registration**

```cpp
String authorizedTags[] = {
    "A1B2C3D4", // Patient 1
    "E5F6G7H8"  // Patient 2
};
```

---

## 🧪 Testing

**Unit Tests:** `/tests/unit-tests/` – Sensors, motors, GSM, RTC
**Integration Tests:** `/tests/integration-tests/` – Full workflow

---

## 📈 Advantages

* Improves medication adherence
* Prevents unauthorized access
* Alerts caregivers instantly
* Simple interface for elderly
* Reliable with power backup
* Affordable, uses off-the-shelf parts

---

## 🔒 Limitations

* Max 3 medication types per device
* Fixed time slots
* Requires GSM coverage
* Setup assistance needed
* Only for solid pills

---

## 🔮 Future Enhancements

* [ ] Mobile app with cloud sync
* [ ] AI-driven reminders
* [ ] Voice assistant integration
* [ ] Multi-patient hospital use
* [ ] Biometric security
* [ ] Environmental monitoring (temp/humidity)

---

## 📚 Documentation

* [Project Report](docs/project-report.pdf)
* [IEEE Conference Paper](docs/ieee-conference-paper.pdf)
* [Literature Survey](docs/literature-survey.md)
* [Patent Draft](docs/patent-draft.pdf)
* [Project Workbook](docs/workbook.pdf)

---

## 👥 Team

**Dr. D. Y. Patil Institute of Technology, Pimpri, Pune**
*Department of Artificial Intelligence & Data Science*

| Name           | Role                                |
| -------------- | ----------------------------------- |
| Sahil Kamble   | Hardware Design & Integration       |
| Pranav Jadhav  | Software Development & Testing      |
| Mandar Gavali  | System Architecture & Documentation |
| Parth Giramkar | Sensor Integration & Validation     |

**Guide:** Prof. Sonam Singh
**Co-Guide:** Prof. Shubhangi Vairagar

---

## 🏆 Acknowledgments

* Dr. D. Y. Patil Institute of Technology
* Dept. of AI & Data Science
* Project Based Learning (PBL) framework
* All literature and prior research references

---

## 📜 License

Licensed under the [MIT License](LICENSE).

---

## 📞 Contact

📧 [sahil Kamble](mailto:sahilkamble0134@gmail.com)
📧 [Pranav Jadhav](mailto:pranavj821@gmail.com)
📧 [Parth Giramkar](mailto:giramkarparth88@gmail.com)
📧 [Mandar Gavali](mailto:mandargavali34@gmail.com)

📍 Dr. D. Y. Patil Institute of Technology, Pimpri, Pune

---

⭐ *If you find this project useful, please star the repository to support us!*


