import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CountdownTimerAliasComponent } from './countdown-timer-alias/countdown-timer-alias.component';
import { CountdownTimerEventAliasComponent } from './countdown-timer-event-alias/countdown-timer-event-alias.component';
import { CountdownTimerEventComponent } from './countdown-timer-event/countdown-timer-event.component';
import { CountdownTimerEventGetSetComponent } from './countdown-timer-event-get-set/countdown-timer-event-get-set.component';
import { CountdownTimerGetSetComponent } from './countdown-timer-get-set/countdown-timer-get-set.component';
import { CountdownTimerOnchangesComponent } from './countdown-timer-onchanges/countdown-timer-onchanges.component';
import { CountdownTimerComponent } from './countdown-timer/countdown-timer.component';
import { NameCarComponent } from './name-card/name-car.component';
import { PipeDemoComponent } from './pipe-demo/pipe-demo.component';
import { ProgressBarComponent } from './progress-bar/progress-bar.component';
import { RatingBarComponent } from './rating-bar/rating-bar.component';

@NgModule({
  declarations: [
    AppComponent,
    CountdownTimerAliasComponent,
    CountdownTimerEventAliasComponent,
    CountdownTimerEventComponent,
    CountdownTimerEventGetSetComponent,
    CountdownTimerGetSetComponent,
    CountdownTimerOnchangesComponent,
    CountdownTimerComponent,
    NameCarComponent,
    PipeDemoComponent,
    ProgressBarComponent,
    RatingBarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
