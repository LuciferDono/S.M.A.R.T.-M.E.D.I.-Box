
# S.M.A.R.T. M.E.D.I. BOX

**Smart Medication Assistance & Reminder Technology for Monitoring, Efficient Dispensing, and Intelligent Box**

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Arduino](https://img.shields.io/badge/Arduino-Compatible-blue.svg)](https://www.arduino.cc/)
[![Status](https://img.shields.io/badge/Status-Prototype-orange.svg)]()

## 🏥 Project Overview

The S.M.A.R.T. M.E.D.I. BOX is an intelligent, automated medication dispenser designed to improve medication adherence among elderly and chronically ill patients. This IoT-enabled embedded system combines RFID/NFC authentication, real-time monitoring, and automated alerts to ensure safe and timely medication dispensing[1][2][3][4].

### **Key Features**

- **🔐 Secure Authentication**: RFID/NFC-based patient verification
- **⏰ Automated Dispensing**: Precise medication dispensing at scheduled times
- **📱 SMS Alerts**: Real-time notifications to caregivers for missed doses
- **🆘 Emergency Support**: SOS button for immediate assistance
- **🔋 Dual Power Supply**: Battery backup for uninterrupted operation
- **📟 User-Friendly Interface**: LCD display with simple button navigation

## 🎯 Problem Statement

Elderly and chronically ill patients face significant challenges in medication adherence due to memory loss, visual impairment, and complex medication regimens. Non-adherence leads to serious health complications, increased hospitalizations, and higher healthcare costs[1]. Traditional pill organizers lack automation, real-time monitoring, and caregiver notification capabilities.

## 🔧 Technical Specifications

### **Hardware Components**
- **Microcontroller**: 2x Arduino Uno (Master-slave configuration)
- **Authentication**: RFID/NFC Module
- **Timing**: DS1302 RTC Module
- **Communication**: GSM SIM800L Module
- **Sensors**: IR Sensor for pill pickup detection
- **Actuators**: 3x Stepper motors for pill dispensing
- **Interface**: 16x2 LCD Display, Buzzer, Push buttons
- **Power**: 12V Battery with AC adapter

### **Software Requirements**
- Arduino IDE
- Libraries: `LiquidCrystal_I2C`, `Stepper`, `SoftwareSerial`, `DS1302`
- Programming Language: C/C++ (Arduino)

## 🚀 Getting Started

### **Prerequisites**
```
- Arduino IDE (v1.8.0 or higher)
- Required Arduino libraries (see src/arduino/libraries/)
- Hardware components (see hardware/components-list.md)
```

### **Installation**

1. **Clone the repository**
```
git clone https://github.com/yourusername/SMART-MEDI-BOX.git
cd SMART-MEDI-BOX
```

2. **Install Arduino Libraries**
```
# Open Arduino IDE
# Go to Sketch > Include Library > Manage Libraries
# Install: LiquidCrystal_I2C, Stepper, SoftwareSerial
```

3. **Hardware Setup**
- Connect components according to circuit diagrams in `hardware/circuit-schematics/`
- Refer to `hardware/components-list.md` for wiring details

4. **Upload Code**
```
# Open src/arduino/smart_medi_box.ino in Arduino IDE
# Select correct board and port
# Upload to Arduino Uno
```

## 💡 How It Works

### **System Architecture**

1. **Initialization**: System boots up, initializes all peripherals (RTC, LCD, GSM, RFID, sensors)
2. **Configuration**: User inputs medication schedules via push buttons
3. **Authentication**: RFID/NFC verification before medication access
4. **Dispensing**: Stepper motors rotate pill compartments at scheduled times
5. **Monitoring**: IR sensors detect pill pickup; alerts sent if missed
6. **Emergency**: SOS button triggers immediate alerts to caregivers

### **Medication Scheduling Flow**

```
User Input → RTC Scheduling → Authentication → Dispensing → Monitoring → Alerts
```

## 📊 System Components

| Component | Function | Implementation |
|-----------|----------|----------------|
| Arduino Uno | Master controller | System coordination and logic |
| DS1302 RTC | Real-time clock | Medication scheduling |
| RFID Module | User authentication | Secure access control |
| Stepper Motors | Pill dispensing | Precise rotation control |
| GSM Module | SMS alerts | Caregiver notifications |
| IR Sensor | Pickup detection | Compliance monitoring |
| LCD Display | User interface | Status and reminders |

## 🎯 Target Applications

- **Personal Healthcare**: Elderly patients living independently
- **Healthcare Facilities**: Nursing homes and rehabilitation centers
- **Chronic Disease Management**: Patients requiring strict medication adherence
- **Remote Monitoring**: Telehealth and home care services

## ⚙️ Configuration

### **Medication Schedule Setup**
```
// Example configuration
TIME_SLOT morning = {8, 0};    // 8:00 AM
TIME_SLOT afternoon = {14, 0}; // 2:00 PM  
TIME_SLOT evening = {20, 0};   // 8:00 PM
```

### **RFID Tag Registration**
```
// Add authorized RFID tags
String authorizedTags[] = {
    "A1B2C3D4",  // Patient 1
    "E5F6G7H8"   // Patient 2
};
```

## 🧪 Testing

Run the test suite to verify system functionality:

```
# Hardware tests
cd tests/unit-tests/
# Run sensor tests, motor tests, communication tests

# Integration tests  
cd tests/integration-tests/
# Run full system workflow tests
```

## 📈 Advantages

- **Improved Adherence**: Automated reminders and dispensing reduce missed doses
- **Enhanced Safety**: RFID authentication prevents unauthorized access
- **Caregiver Support**: Real-time SMS alerts enable timely interventions
- **User-Friendly**: Simple interface suitable for elderly users
- **Reliable Operation**: Battery backup ensures continuous functionality
- **Cost-Effective**: Affordable solution using standard components

## 🔒 Limitations

- **Medication Capacity**: Limited to 3 medication types per device
- **Schedule Flexibility**: Fixed time slots (morning, afternoon, evening)
- **Network Dependency**: GSM alerts require cellular coverage
- **Manual Setup**: Initial configuration requires caregiver assistance
- **Pill Type Restriction**: Designed for solid pills only

## 🔮 Future Enhancements

- [ ] **Mobile App Integration**: Remote monitoring and configuration
- [ ] **AI-Powered Reminders**: Predictive alerts based on patient behavior
- [ ] **Voice Assistant**: Audio reminders and voice-controlled interface
- [ ] **Multi-Patient Support**: Hospital and nursing home deployment
- [ ] **Cloud Connectivity**: Data analytics and remote physician access
- [ ] **Biometric Authentication**: Fingerprint or facial recognition
- [ ] **Environmental Monitoring**: Temperature and humidity sensors

## 📚 Documentation

- [**Project Report**](docs/project-report.pdf) - Complete technical documentation
- [**IEEE Conference Paper**](docs/ieee-conference-paper.pdf) - Research publication
- [**Literature Survey**](docs/literature-survey.md) - Background research
- [**Patent Draft**](docs/patent-draft.pdf) - Intellectual property documentation
- [**Project Workbook**](docs/workbook.pdf) - Development process record

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


## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Contact

For questions, suggestions, or collaboration opportunities:

- **Email**: sahilkamble0134@gmail.com
- **Email**: pranavj821@gmail.com
- **Email**: giramkarparth88@gmail.com
- **Email**: mandargavali34@gmail.com

- **Project Repository**: [GitHub](https://github.com/LuciferDono/SMART-MEDI-BOX)
- **Institution**: Dr. D. Y. Patil Institute of Technology, Pimpri, Pune

## 🌟 Star This Repository

If you found this project helpful, please consider giving it a star ⭐ to show your support!
